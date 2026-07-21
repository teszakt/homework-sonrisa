package hu.teszakt.homework.sonrisa.model;

import hu.teszakt.homework.sonrisa.model.enums.AlertType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
public class Event implements Serializable {

    @NonNull
    private AlertType alertType;
    @NonNull
    private String message;
    @NonNull
    private OffsetDateTime createdAt;

}
