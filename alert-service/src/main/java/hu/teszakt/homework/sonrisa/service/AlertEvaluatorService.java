package hu.teszakt.homework.sonrisa.service;

import hu.teszakt.homework.sonrisa.db.entity.AlertEntity;
import hu.teszakt.homework.sonrisa.model.Event;
import lombok.NonNull;

import java.util.List;

public interface AlertEvaluatorService {

    List<AlertEntity> findMatchingAlerts(@NonNull Event event);

}
