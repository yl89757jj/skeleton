package api;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class CreatTagRequest {
   @NotNull
    public int receipt_id;

}
