package hu.teszakt.homework.sonrisa.app;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class AlertApplication {

    public static void main(String[] args) {
        log.info("Running alert application");
        SpringApplication.run(AlertApplication.class);
    }

}