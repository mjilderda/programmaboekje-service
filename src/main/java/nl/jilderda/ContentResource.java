package nl.jilderda;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/content")
public class ContentResource {

    @Inject
    String pupilUitnodiging;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPupilContent() {
        return pupilUitnodiging;
    }
}
