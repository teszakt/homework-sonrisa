package hu.teszakt.homework.sonrisa.app.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping(
        name = "admin",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class AdminController {

    // TODO GET /admin/alerts
    // TODO GET /admin/alert/{id}
    // TODO GET /admin/notifications
    // TODO GET /admin/users
    // TODO GET /admin/user/{id}


}
