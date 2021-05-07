package com.restproject.demorest;


import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@javax.ws.rs.Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @javax.ws.rs.Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
