package pl.sapiens.javarestsoap.service;

import lombok.extern.slf4j.Slf4j;
import pl.sapiens.javarestsoap.dao.ReservationsDAO;
import pl.sapiens.javarestsoap.entity.Reservation;
import pl.sapiens.javarestsoap.exception.NoReservationFoundException;
import pl.sapiens.javarestsoap.exception.NoReservationFoundExceptionBetter;

import java.util.List;

@Slf4j
public class ReservationsService {

    private final ReservationsDAO dataSource = new ReservationsDAO();

    public List<Reservation> getAllReservationsFromDataSource() {
        log.info("getting all reservations");
        var result = dataSource.findAllReservations();
        log.info("result: {}", result);
        return result;
    }

    public Reservation getReservationById(Long id) throws NoReservationFoundException {
        log.info("getting reservation with id: [{}]", id);
        var maybeReservation = dataSource.findReservationById(id);

        return maybeReservation.orElseThrow(() -> new NoReservationFoundException("No reservation with id: " + id));
    }

    public Reservation getReservationByIdBetter(Long id) throws NoReservationFoundExceptionBetter {
        log.info("getting reservation with id: [{}]", id);
        var maybeReservation = dataSource.findReservationById(id);

        return maybeReservation.orElseThrow(() -> new NoReservationFoundExceptionBetter("No reservation with id: " + id));
    }

}
