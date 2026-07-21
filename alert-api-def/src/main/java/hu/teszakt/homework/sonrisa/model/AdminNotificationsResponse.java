package hu.teszakt.homework.sonrisa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class AdminNotificationsResponse implements Serializable {

    private List<Notification> notifications = new ArrayList<>();

}
