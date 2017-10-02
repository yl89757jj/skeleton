package controllers;


import api.CreateReceiptRequest;
import api.ReceiptResponse;
import dao.ReceiptDao;
import dao.TagDao;
import generated.tables.records.ReceiptsRecord;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static java.util.stream.Collectors.toList;


@Path("/tags/{tag}")
@Consumes(MediaType.APPLICATION_JSON)
public class TagController {
    final TagDao tags;

    public TagController(TagDao tags) {
        this.tags = tags;
    }

    @PUT
    public void toggleTag(@PathParam("tag") String tagName, int id){
        tags.toggle(tagName, id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ReceiptResponse> getAllReceipts(@PathParam("tag") String tagName) {
        List<ReceiptsRecord> receiptsRecords = tags.getAllReceipts(tagName);
        return receiptsRecords.stream().map(ReceiptResponse::new).collect(toList());
    }
}
