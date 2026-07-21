package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.db.repository.EventRepository;
import hu.teszakt.homework.sonrisa.model.EventCreationResponse;
import hu.teszakt.homework.sonrisa.model.enums.EventCreationRequest;
import hu.teszakt.homework.sonrisa.service.AbstractBaseService;
import hu.teszakt.homework.sonrisa.service.EventService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class EventServiceImpl extends AbstractBaseService implements EventService {

    private final EventRepository eventRepository;

    @Override
    public EventCreationResponse createEvent(@NonNull EventCreationRequest request) {
        log.debug("Running createEvent service method for event: {}", request.getEvent().getAlertType());
        // TODO impl

        log.debug("createEvent service method successfully finished");
        throw new UnsupportedOperationException("Not supported yet");
    }

}
