package hu.teszakt.homework.sonrisa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class AdminNotificationDeliveriesResponse implements Serializable {

    private List<NotificationDelivery> notificationDeliveries = new ArrayList<>();

}
