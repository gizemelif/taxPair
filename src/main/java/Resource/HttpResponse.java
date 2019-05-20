package Resource;

import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("rest/resource")
@Produces(MediaType.APPLICATION_JSON)
public class HttpResponse {
    @GET
    @Path("/json")
    public Response getJsonResponse(){
        okhttp3.Response response = client.newCall(request).execute();

        ObjectMapper mapper = new ObjectMapper();
        String message = "{\"hello\": \"This is a JSON response\"}";

        return Response
                .status(Response.Status.OK)
                .entity(message)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

}
