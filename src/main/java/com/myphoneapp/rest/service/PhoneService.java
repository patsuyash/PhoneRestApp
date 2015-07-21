package com.myphoneapp.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.myphoneapp.rest.dto.PhoneDto;


@Path("/phones")
public interface PhoneService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPhones();
	
	@GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getPhones(@PathParam("id") Integer id);
    
    @POST
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPhone(PhoneDto sampleDto);
    
    @POST
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePhone(PhoneDto sampleDto);
    
    @POST
    @Path("/delete")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteResponse(PhoneDto sampleDto);
}
