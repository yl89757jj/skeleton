package controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import io.dropwizard.jersey.sessions.Session;

// For a Java class to be eligible to receive ANY requests
// it must be annotated with at least @Path
@Path("")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldController {

    // You can specify additional @Path steps; they will be relative
    // to the @Path defined at the class level
    @GET
    @Path("/hello")
    public String helloWorld(@Session HttpSession session) {
        return "Hello World " + session.toString();
    }

     @GET
     @Path("/netid")
     public String netid() {
        return "ly354" ;
     }

    @PUT
    @Path("/tags/{tag}")
    public void toggleTag(@PathParam("tag") String tagName) {
        // <your code here
    }

     @POST
     @Path("/netid")
    public String ListResipts(){
        return null;
     }
}
