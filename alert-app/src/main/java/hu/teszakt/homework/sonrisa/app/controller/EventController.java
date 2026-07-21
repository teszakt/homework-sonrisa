package hu.teszakt.homework.sonrisa.app.controller;

import hu.teszakt.homework.sonrisa.model.EventCreationResponse;
import hu.teszakt.homework.sonrisa.model.enums.EventCreationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping(
        name = "event",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class EventController {

    public EventCreationResponse createEvent(@RequestBody EventCreationRequest request) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
