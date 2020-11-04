package example.web.SCADA;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Hello world!
 *
 */
@Path("/app")
public class App 
{
	@GET
	@Path("/hello")
	@Produces("text/xml")
    public Response helloWorld() {
    	return Response.status(200).entity("Hello world").build();
    }
}