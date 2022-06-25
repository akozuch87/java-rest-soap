package pl.sapiens.javarestsoap.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    Long id;

    String surname;

    Integer tableNumber;

    LocalDateTime startPoint;

    LocalDateTime endPoint;

    // TODO: migrate to Address class
    String address;

    String customerComments;
}
