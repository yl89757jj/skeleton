package controllers;

import api.CreateReceiptTagRequest;
import api.ReceiptResponse;
import dao.TagDao;
import generated.tables.records.ReceiptsRecord;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/tags/{tag}")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReceiptTagController {
    final TagDao tagList;

    public ReceiptTagController(TagDao tagList){
        this.tagList = tagList;
    }

    @PUT
    public void toggleTag(@PathParam("tag") String tagName, Integer tagRequest) {
        tagList.handle(tagName, tagRequest);
    }

    @GET
    public List<ReceiptResponse> getReceipts(@PathParam("tag") String tagName){
        List<ReceiptsRecord> receipts = tagList.getAllReceiptsWithGivenTag(tagName);
        return receipts.stream().map(ReceiptResponse::new).collect(Collectors.toList());
    }

}
