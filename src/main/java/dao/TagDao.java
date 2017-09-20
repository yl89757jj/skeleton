package dao;

import generated.tables.Tags;
import generated.tables.records.ReceiptsRecord;
import generated.tables.records.TagsRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import java.util.ArrayList;
import java.util.List;
import static generated.Tables.RECEIPTS;
import static generated.Tables.TAGS;
import static com.google.common.base.Preconditions.checkState;

public class TagDao {
    DSLContext dsl;

    public TagDao(Configuration jooqConfig){
        this.dsl = DSL.using(jooqConfig);
    }

    public void handle(String tagName, int recordId){
        TagsRecord currentTagsRecord = dsl.selectFrom(TAGS).where(TAGS.ID.eq(recordId)).and(TAGS.TAG.eq(tagName)).fetchOne();
        if(currentTagsRecord == null){
            // Insert new entry to the tags table
            currentTagsRecord = dsl.insertInto(TAGS, TAGS.ID, TAGS.TAG).values(recordId, tagName)
                    .returning(TAGS.TAGID).fetchOne();
            checkState(currentTagsRecord != null
                    && currentTagsRecord.getTagid() != null, "Insert failed");
        }else{
            // Untag/Remove the row from the tag table
            currentTagsRecord.delete();
        }

    }


    public List<ReceiptsRecord> getAllReceiptsWithGivenTag(String tagName){
        // First obtain tag records where the tag column equals tagName
        List<TagsRecord> tagsRecords = dsl.selectFrom(TAGS).where(TAGS.TAG.eq(tagName)).fetch();
        List<ReceiptsRecord> receipts = new ArrayList<>();
        for(TagsRecord record : tagsRecords){
              receipts.add(dsl.selectFrom(RECEIPTS).where(RECEIPTS.ID.eq(record.getId())).fetchOne());
        }
        return receipts;
    }
}
