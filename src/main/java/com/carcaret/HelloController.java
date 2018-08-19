package com.carcaret;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Produces(MediaType.TEXT_PLAIN)
@Path("/")
public class HelloController {

    @Inject
    private HelloService service;

    @GET
    @Path("/hello")
    public String sayHello() {
        return service.message();
    }
}
