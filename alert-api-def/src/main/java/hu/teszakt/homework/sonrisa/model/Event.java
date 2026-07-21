package hu.teszakt.homework.sonrisa.model;

import hu.teszakt.homework.sonrisa.model.enums.AlertType;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
public class Event implements Serializable {

    @NonNull
    private final AlertType alertType;
    @NonNull
    private final String message;
    @NonNull
    private final OffsetDateTime createdAt;

}
