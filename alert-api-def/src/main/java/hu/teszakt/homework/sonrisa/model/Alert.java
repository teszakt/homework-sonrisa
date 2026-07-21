package hu.teszakt.homework.sonrisa.model;

import hu.teszakt.homework.sonrisa.model.enums.AlertType;
import hu.teszakt.homework.sonrisa.model.enums.NotificationChannelType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class Alert implements Serializable {

    private long userId;
    @NonNull
    private AlertType alertType;
    @NonNull
    private String criteria;
    @NonNull
    private Set<NotificationChannelType> channels = new HashSet<>();
    @NonNull
    private OffsetDateTime createdAt;

}
