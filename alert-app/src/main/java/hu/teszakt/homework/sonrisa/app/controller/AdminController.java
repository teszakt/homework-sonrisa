package hu.teszakt.homework.sonrisa.app.controller;

import hu.teszakt.homework.sonrisa.model.AdminAlertResponse;
import hu.teszakt.homework.sonrisa.model.AdminAlertsResponse;
import hu.teszakt.homework.sonrisa.model.AdminNotificationDeliveriesResponse;
import hu.teszakt.homework.sonrisa.model.AdminNotificationsResponse;
import hu.teszakt.homework.sonrisa.model.AdminUserResponse;
import hu.teszakt.homework.sonrisa.model.AdminUsersResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping(
        value = "admin",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class AdminController {

    @GetMapping(value = "alerts")
    public AdminAlertsResponse getAlerts() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @GetMapping(value = "alert/{id}")
    public AdminAlertResponse getAlertById(@PathVariable(value = "id") Long alertId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @GetMapping(value = "users")
    public AdminUsersResponse getUsers() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @GetMapping(value = "user/{id}")
    public AdminUserResponse getUserById(@PathVariable(value = "id") Long userId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @GetMapping(value = "notifications")
    public AdminNotificationsResponse getNotifications() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @GetMapping(value = "notificationDeliveries")
    public AdminNotificationDeliveriesResponse getNotificationDeliveries() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
