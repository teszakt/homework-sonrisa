package hu.teszakt.homework.sonrisa.app.configuration;

import hu.teszakt.homework.sonrisa.service.configuration.AlertServiceConfiguration;
import hu.teszakt.homework.sonrisa.service.configuration.ConfiguredObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration
@ComponentScan(
        basePackageClasses = AlertServiceConfiguration.class
)
public class AlertApplicationConfiguration {

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        return new MappingJackson2HttpMessageConverter(ConfiguredObjectMapper.configureObjectMapper());
    }

}
