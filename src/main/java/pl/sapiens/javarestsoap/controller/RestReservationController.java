package pl.sapiens.javarestsoap.controller;

import lombok.extern.slf4j.Slf4j;
import pl.sapiens.javarestsoap.entity.Reservation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Slf4j
@Path("/reservations")
public class RestReservationController {

    public static final Reservation THEONLYONE = new Reservation(1L,
            "Kozuch",
            13,
            LocalDateTime.now(),
            LocalDateTime.now().plusHours(2),
            "Main center",
            "Near the window!");

    @GET
    public Response getReservations () {
        var dummyReservations = List.of(THEONLYONE);

        log.info("Getting all reservations");
        log.info("Number of found reservations: [{}]", dummyReservations.size());

        return Response.ok(dummyReservations).build();
    }

    @GET
    @Path("/{id}")
    public Response getReservationsById(@PathParam("id") Long    reservationId) {
        log.info("Trying to find reservation by id: [{}]", reservationId);

        // TODO: replace with integration with service
        Response result;
        if (reservationId == 1L) {
            result = Response.ok(THEONLYONE).build();
        } else {
            result = Response.status(Response.Status.NOT_FOUND).build();
        }
        return result;
    };

    @POST
    public Response createReservation(Reservation toCreate) throws URISyntaxException {
        log.info("Trying to create reservation [{}]", toCreate);

        //TODO: use service, add validation
        URI location = new URI("/reservations/2");

        return Response.created(location).build();
    }

}
