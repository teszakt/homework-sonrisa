package hu.teszakt.homework.sonrisa.model;

import hu.teszakt.homework.sonrisa.model.enums.NotificationChannelType;
import hu.teszakt.homework.sonrisa.model.enums.NotificationDeliveryStatusType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
public class NotificationDelivery {

    @NonNull
    private Notification notification;
    @NotNull
    private NotificationChannelType channelType;
    @NotNull
    private NotificationDeliveryStatusType status;
    @NotNull
    private OffsetDateTime sentAt;
    private String failureMessage;
    private Long attempts;

}
