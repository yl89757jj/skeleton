package dao;

import generated.tables.records.TagsRecord;
import generated.tables.records.ReceiptsRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import javax.validation.constraints.Null;

import static com.google.common.base.Preconditions.checkState;
import static generated.Tables.RECEIPTS;
import static generated.Tables.TAGS;

import java.math.BigDecimal;
import java.util.List;

public class TagDao {
    DSLContext dsl;
    public TagDao(Configuration jooqConfig) {
        this.dsl = DSL.using(jooqConfig);
    }

    //public int insert(int id, String tagName) {
    //    TagsRecord tagsRecord = dsl
    //            .insertInto(TAGS, TAGS.ID, TAGS.TAG)
    //            .values(id, tagName)
    //            .returning(TAGS.ID, TAGS.TAG)
    //            .fetchOne();

    //    checkState(tagsRecord != null && tagsRecord.getId() != null, "Insert failed");

    //    return tagsRecord.getId();
    //}

//    public boolean isTaged(int id, String tagName) {
//        TagsRecord tagsRecord = dsl.selectFrom(TAGS).where(TAGS.ID.eq(id)).and(TAGS.TAG.eq(tagName)).fetchOne();
//        checkState(tagsRecord != null && tagsRecord.getId() != null, "IsTaged failed");
//        return tagsRecord != null;
//    }

//    public void delete(int id, String tagName) {
//        dsl.deleteFrom(TAGS).where(TAGS.ID.eq(id)).and(TAGS.TAG.eq(tagName)).execute();
//    }
    public void toggle(String tagName, int id) {
        if (dsl.selectFrom(RECEIPTS).where(RECEIPTS.ID.eq(id)).fetchOne() != null) {
            if (dsl.selectFrom(TAGS).where(TAGS.ID.eq(id).and(TAGS.TAG.eq(tagName))).fetchOne() == null) {
                dsl.insertInto(TAGS).values(id, tagName).execute();
            }
            else {dsl.deleteFrom(TAGS).where(TAGS.ID.eq(id).and(TAGS.TAG.eq(tagName)));
            }
        }
    }

    public List<ReceiptsRecord> getAllReceipts(String tagName) {
        return dsl.selectFrom(RECEIPTS).where(RECEIPTS.ID.in(dsl.select(TAGS.ID).from(TAGS).where(TAGS.TAG.eq(tagName)).fetch())).fetch();
    }
}
