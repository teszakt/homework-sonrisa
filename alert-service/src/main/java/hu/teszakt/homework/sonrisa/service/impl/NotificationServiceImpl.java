package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.db.entity.AlertEntity;
import hu.teszakt.homework.sonrisa.db.entity.NotificationEntity;
import hu.teszakt.homework.sonrisa.db.repository.NotificationRepository;
import hu.teszakt.homework.sonrisa.model.Event;
import hu.teszakt.homework.sonrisa.service.NotificationDispatcher;
import hu.teszakt.homework.sonrisa.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;
    private final NotificationDispatcher notificationDispatcher;

    @Override
    public void notify(List<AlertEntity> alerts, Event event) {
        log.debug("Notification notify called");
        for (AlertEntity alert : alerts) {
            final NotificationEntity notificationEntity = createNotification(alert, event);
            notificationRepository.save(notificationEntity);

            // TODO handle channelType
//            notificationDispatcher.dispatch(channelType, notificationEntity);
        }
        log.debug("Notification notify successfully finished.");
    }

    private NotificationEntity createNotification(AlertEntity alertEntity, Event event) {
        // TODO impl
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
