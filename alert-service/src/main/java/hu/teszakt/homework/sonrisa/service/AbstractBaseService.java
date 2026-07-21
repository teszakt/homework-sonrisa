package hu.teszakt.homework.sonrisa.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.teszakt.homework.sonrisa.service.configuration.ConfiguredObjectMapper;
import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class AbstractBaseService {

    protected final ObjectMapper objectMapper = ConfiguredObjectMapper.configureObjectMapper();

}
