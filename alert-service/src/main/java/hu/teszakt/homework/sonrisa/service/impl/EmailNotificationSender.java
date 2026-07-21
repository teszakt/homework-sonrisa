package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.db.entity.NotificationEntity;
import hu.teszakt.homework.sonrisa.model.enums.NotificationChannelType;
import hu.teszakt.homework.sonrisa.service.NotificationSender;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class EmailNotificationSender extends NotificationSender {

    @Override
    protected NotificationChannelType getChannelType() {
        return NotificationChannelType.EMAIL;
    }

    @Override
    protected void send(NotificationEntity notification) {
        // TODO impl based on emailClient
        throw new UnsupportedOperationException("Not supported yet");
    }

}
