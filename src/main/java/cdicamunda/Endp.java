package cdicamunda;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/")
public class Endp {
	
	@Inject LoanApproval prozess;
	
	@GET
	@Path("/start-process")
	public Response name() {
		prozess.start();
		return Response.ok("OK").build();
	}

}
