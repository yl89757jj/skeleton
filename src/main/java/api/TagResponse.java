package api;

import com.fasterxml.jackson.annotation.JsonProperty;
import generated.tables.records.ReceiptsRecord;
import generated.tables.records.TagsRecord;

import java.math.BigDecimal;
import java.sql.Time;

public class TagResponse {
/*  id INT UNSIGNED AUTO_INCREMENT,
uploaded TIME DEFAULT CURRENT_TIME(),
    receipt_id INT UNSIGNED,
    tag VARCHAR (255),

    PRIMARY KEY (id)*/

        @JsonProperty
        Integer id;

        @JsonProperty
        Integer receipt_id;

        @JsonProperty
        String value;

        @JsonProperty
        Time created;

        public TagResponse(TagsRecord newRecord) {
            this.receipt_id = newRecord.getReceiptId();
            this.value = newRecord.getTag();
            this.created = newRecord.getUploaded();
            this.id = newRecord.getId();
        }
}
