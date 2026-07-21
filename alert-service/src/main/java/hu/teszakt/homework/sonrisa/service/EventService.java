package hu.teszakt.homework.sonrisa.service;

import hu.teszakt.homework.sonrisa.model.EventCreationResponse;
import hu.teszakt.homework.sonrisa.model.enums.EventCreationRequest;
import org.springframework.lang.NonNull;

public interface EventService {

    EventCreationResponse createEvent(@NonNull EventCreationRequest request);

}
