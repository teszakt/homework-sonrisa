package hu.teszakt.homework.sonrisa.service.configuration;

import hu.teszakt.homework.sonrisa.db.configuration.AlertDbConfiguration;
import hu.teszakt.homework.sonrisa.service.NotificationDispatcher;
import hu.teszakt.homework.sonrisa.service.impl.AlertServiceImpl;
import hu.teszakt.homework.sonrisa.service.impl.EmailNotificationSender;
import hu.teszakt.homework.sonrisa.service.impl.EventServiceImpl;
import hu.teszakt.homework.sonrisa.service.impl.SlackNotificationSender;
import hu.teszakt.homework.sonrisa.service.impl.UserServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackageClasses = {
                AlertDbConfiguration.class,
                UserServiceImpl.class,
                AlertServiceImpl.class,
                EventServiceImpl.class,
                EmailNotificationSender.class,
                SlackNotificationSender.class,
                NotificationDispatcher.class
        }
)
public class AlertServiceConfiguration {
}
