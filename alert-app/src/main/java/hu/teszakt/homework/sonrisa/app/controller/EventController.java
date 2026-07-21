package hu.teszakt.homework.sonrisa.app.controller;

import hu.teszakt.homework.sonrisa.model.EventCreationResponse;
import hu.teszakt.homework.sonrisa.model.enums.EventCreationRequest;
import hu.teszakt.homework.sonrisa.service.EventService;
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

    private final EventService eventService;

    public EventCreationResponse createEvent(@RequestBody EventCreationRequest request) {
        log.debug("Running createEvent controller method");
        final EventCreationResponse response = eventService.createEvent(request);
        log.debug("createEvent controller method successfully finished");
        return response;
    }

}
