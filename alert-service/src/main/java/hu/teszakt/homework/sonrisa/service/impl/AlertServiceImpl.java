package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.model.AlertCreationRequest;
import hu.teszakt.homework.sonrisa.model.AlertCreationResponse;
import hu.teszakt.homework.sonrisa.service.AbstractBaseService;
import hu.teszakt.homework.sonrisa.service.AlertService;
import lombok.extern.log4j.Log4j2;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class AlertServiceImpl extends AbstractBaseService implements AlertService {

    @Override
    public AlertCreationResponse createAlert(@NonNull AlertCreationRequest request) {
        log.debug("Running createAlert service method for event: {}", request.getAlert().getAlertType());
        // TODO impl

        log.debug("createAlert service method successfully finished");
        throw new UnsupportedOperationException("Not supported yet");
    }

}
