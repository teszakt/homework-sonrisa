package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.db.entity.AlertEntity;
import hu.teszakt.homework.sonrisa.db.repository.AlertRepository;
import hu.teszakt.homework.sonrisa.model.Event;
import hu.teszakt.homework.sonrisa.service.AlertEvaluatorService;
import hu.teszakt.homework.sonrisa.service.exception.AlertException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class AlertEvaluatorServiceImpl implements AlertEvaluatorService {

    private final AlertRepository alertRepository;

    @Override
    public List<AlertEntity> findMatchingAlerts(@NonNull Event event) {
        log.info("Running findMatchingAlerts method for event {} {}", event.getAlertType(), event.getMessage());
        try {
            // TODO find alerts from database
            final List<AlertEntity> alerts = new ArrayList<>();

            log.info("findMatchingAlerts method successfully finished");
            return alerts;
        }
        catch (Exception ex) {
            throw new AlertException(ex.getMessage());
        }
    }

}
