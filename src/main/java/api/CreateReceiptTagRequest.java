package api;

import javax.validation.constraints.NotNull;

public class CreateReceiptTagRequest {
    @NotNull
    public int receiptId;

}
