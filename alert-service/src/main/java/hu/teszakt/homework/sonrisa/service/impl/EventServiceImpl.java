package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.db.entity.AlertEntity;
import hu.teszakt.homework.sonrisa.db.entity.EventEntity;
import hu.teszakt.homework.sonrisa.db.repository.EventRepository;
import hu.teszakt.homework.sonrisa.model.EventCreationResponse;
import hu.teszakt.homework.sonrisa.model.enums.EventCreationRequest;
import hu.teszakt.homework.sonrisa.service.AbstractBaseService;
import hu.teszakt.homework.sonrisa.service.AlertEvaluatorService;
import hu.teszakt.homework.sonrisa.service.EventService;
import hu.teszakt.homework.sonrisa.service.NotificationService;
import hu.teszakt.homework.sonrisa.service.exception.AlertException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class EventServiceImpl extends AbstractBaseService implements EventService {

    private final EventRepository eventRepository;
    private final AlertEvaluatorService alertEvaluatorService;
    private final NotificationService notificationService;

    @Override
    public EventCreationResponse createEvent(@NonNull EventCreationRequest request) {
        log.debug("Running createEvent service method for event: {}", request.getEvent().getAlertType());
        try {
            // TODO mapstruct mapping
            final EventEntity eventEntity = null;
            eventRepository.save(eventEntity);

            final List<AlertEntity> matchingAlerts = alertEvaluatorService.findMatchingAlerts(request.getEvent());
            notificationService.notify(matchingAlerts, request.getEvent());

            log.debug("createEvent service method successfully finished");
            return new EventCreationResponse(eventEntity.getId());
        }
        catch (AlertException ex) {
            throw ex;
        }
        catch (Exception ex) {
            throw new AlertException(ex.getMessage());
        }
    }

}
