package com.mulesoft.se.orders;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/prices")
public class ProductPrice {

	@GET
	@Path("/{productId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getProductPrice(@PathParam("productId") String productId) {
		return "159";
	}

}
