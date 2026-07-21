package hu.teszakt.homework.sonrisa.model;

import hu.teszakt.homework.sonrisa.model.enums.NotificationStatusType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
public class Notification implements Serializable {

    @NonNull
    private User user;
    @NonNull
    private Alert alert;
    @NonNull
    private String message;
    @NotNull
    private OffsetDateTime createdAt;
    @NotNull
    private NotificationStatusType status;

}
