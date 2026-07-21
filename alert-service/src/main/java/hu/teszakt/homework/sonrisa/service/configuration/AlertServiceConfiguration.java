package hu.teszakt.homework.sonrisa.service.configuration;

import hu.teszakt.homework.sonrisa.db.configuration.AlertDbConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackageClasses = AlertDbConfiguration.class
)
public class AlertServiceConfiguration {
}
