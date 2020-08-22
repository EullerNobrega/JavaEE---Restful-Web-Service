package com.euller.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/users")
public class UserService {

	@GET
	@Produces("aplication/json")
	public Response getUsers() {
		JSONObject jsonObject =  new JSONObject();
		jsonObject.put("value 1", 1);
		jsonObject.put("value 2", 6);
		
		String result = "('application/json') Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}
		