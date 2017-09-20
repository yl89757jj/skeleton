package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/netid")
@Produces(MediaType.APPLICATION_JSON)
public class NetIdController {

    @GET
    public String getNetId(){
        return "ly354";
    }
}
