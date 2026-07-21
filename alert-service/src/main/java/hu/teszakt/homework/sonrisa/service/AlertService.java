package hu.teszakt.homework.sonrisa.service;

import hu.teszakt.homework.sonrisa.model.AlertCreationRequest;
import hu.teszakt.homework.sonrisa.model.AlertCreationResponse;
import org.springframework.lang.NonNull;

public interface AlertService {

    AlertCreationResponse createAlert(@NonNull AlertCreationRequest request);

}
