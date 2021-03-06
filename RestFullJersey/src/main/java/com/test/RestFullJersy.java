package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
// defines URI Path . can be used on class on method
public class RestFullJersy {
	@GET
	public Response display()
	{
		String response="you are accessing RestFull Services";
		return Response.status(200).entity(response).build();
	}
	
	
	@GET
	@Path("/{name}")
	public Response printInfo(@PathParam("name") String name) 
	//requests the parameter to the URI Path
	{
		String response="you are passing ......" + name;
		return Response.status(200).entity(response).build();
	}
	
	

}
