package hu.teszakt.homework.sonrisa.app.controller;

import hu.teszakt.homework.sonrisa.model.AlertCreationRequest;
import hu.teszakt.homework.sonrisa.model.AlertCreationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping(
        name = "user",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class AlertController {

    @PostMapping(name = "add")
    public AlertCreationResponse createAlert(@RequestBody AlertCreationRequest request) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
