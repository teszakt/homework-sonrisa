package hu.teszakt.homework.sonrisa.service;

import hu.teszakt.homework.sonrisa.db.entity.NotificationEntity;
import hu.teszakt.homework.sonrisa.db.repository.NotificationDeliveryRepository;
import hu.teszakt.homework.sonrisa.model.enums.NotificationChannelType;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public abstract class NotificationSender {

    protected NotificationDeliveryRepository notificationDeliveryRepository;

    protected abstract NotificationChannelType getChannelType();

    protected abstract void send(NotificationEntity notification);

}
