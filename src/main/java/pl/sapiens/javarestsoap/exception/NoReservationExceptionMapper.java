package pl.sapiens.javarestsoap.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NoReservationExceptionMapper implements ExceptionMapper<NoReservationFoundExceptionBetter> {

    @Override
    public Response toResponse(NoReservationFoundExceptionBetter exception) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
