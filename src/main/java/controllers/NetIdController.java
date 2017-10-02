package controllers;

import javax.ws.rs.*;

@Path("/netid")
public class NetIdController {
    @GET
    public String getNetID() {
        return "ly354";
    }
}
