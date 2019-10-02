package ${package};

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/hello")
public class HelloREST {

    @GET
    public Response hello(){

        return Response
                .ok( "Hello World")
                .build();
    }

}