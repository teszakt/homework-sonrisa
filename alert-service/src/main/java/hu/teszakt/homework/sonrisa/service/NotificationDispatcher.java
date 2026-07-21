package hu.teszakt.homework.sonrisa.service;

import hu.teszakt.homework.sonrisa.db.entity.NotificationEntity;
import hu.teszakt.homework.sonrisa.model.enums.NotificationChannelType;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Log4j2
public class NotificationDispatcher {

    private final Map<NotificationChannelType, NotificationSender> senders;

    public NotificationDispatcher(List<NotificationSender> senderList) {
        this.senders = senderList.stream()
                                 .collect(Collectors.toMap(NotificationSender::getChannelType, Function.identity()));
    }

    public void dispatch(@NonNull NotificationChannelType channelType, @NonNull NotificationEntity notification) {
        log.info("Notification dispatcher called for channel {} with id {}", channelType, notification.getId());
        final NotificationSender sender = senders.get(channelType);
        if (sender == null) {
            log.warn("No sender found for {}", channelType);
            return;
        }
        sender.send(notification);
        log.info("Notification successfully sent");
    }

}
