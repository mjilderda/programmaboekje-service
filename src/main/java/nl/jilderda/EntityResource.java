package nl.jilderda;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import nl.jilderda.model.entity.Wedstrijd;

@Path("/wedstrijd")
@Slf4j
public class EntityResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public Response updateWedstrijd(Wedstrijd wedstrijd) {
        log.info("Wedstrijd updaten");
        wedstrijd.persist();
        return Response.ok().entity(wedstrijd).build();
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public Response getWedstrijd(Long id) {
        Wedstrijd wedstrijd = Wedstrijd.findById(id);
        if (wedstrijd == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok().entity(wedstrijd).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Transactional
    public Response getWedstrijden(Wedstrijd wedstrijd) {

        log.info("Ophalen wedstrijden");
        return Response.ok().entity(wedstrijd).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public Response deleteWedstrijd(Long id) {
        Wedstrijd wedstrijd = Wedstrijd.findById(id);
        if (wedstrijd == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        wedstrijd.delete();

        return Response.ok().build();
    }
}
