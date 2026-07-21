package hu.teszakt.homework.sonrisa.service;

import hu.teszakt.homework.sonrisa.db.entity.AlertEntity;
import hu.teszakt.homework.sonrisa.model.Event;

import java.util.List;

public interface NotificationService {

    public void notify(List<AlertEntity> alerts, Event event);

}
