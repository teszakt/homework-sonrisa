package hu.teszakt.homework.sonrisa.db.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "hu.teszakt.homework.sonrisa.db.entity")
@EnableJpaRepositories(basePackages = "hu.teszakt.homework.sonrisa.db.repository")
public class AlertDbConfiguration {
}
