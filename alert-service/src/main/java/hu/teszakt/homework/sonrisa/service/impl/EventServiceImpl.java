package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.model.EventCreationResponse;
import hu.teszakt.homework.sonrisa.model.enums.EventCreationRequest;
import hu.teszakt.homework.sonrisa.service.AbstractBaseService;
import hu.teszakt.homework.sonrisa.service.EventService;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class EventServiceImpl extends AbstractBaseService implements EventService {

    @Override
    public EventCreationResponse createEvent(@NonNull EventCreationRequest request) {
        throw new UnsupportedOperationException("Not supported yet");
    }

}
