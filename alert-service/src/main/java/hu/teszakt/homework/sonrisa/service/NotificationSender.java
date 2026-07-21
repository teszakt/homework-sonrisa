package hu.teszakt.homework.sonrisa.service;

import hu.teszakt.homework.sonrisa.db.entity.NotificationEntity;
import hu.teszakt.homework.sonrisa.model.enums.NotificationChannelType;
import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class NotificationSender {

    protected abstract NotificationChannelType getChannelType();

    protected abstract void send(NotificationEntity notification);

}
