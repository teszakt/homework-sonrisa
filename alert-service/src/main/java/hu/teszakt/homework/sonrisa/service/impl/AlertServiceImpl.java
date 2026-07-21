package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.db.entity.AlertEntity;
import hu.teszakt.homework.sonrisa.db.entity.UserEntity;
import hu.teszakt.homework.sonrisa.db.repository.AlertRepository;
import hu.teszakt.homework.sonrisa.db.repository.UserRepository;
import hu.teszakt.homework.sonrisa.model.AlertCreationRequest;
import hu.teszakt.homework.sonrisa.model.AlertCreationResponse;
import hu.teszakt.homework.sonrisa.service.AbstractBaseService;
import hu.teszakt.homework.sonrisa.service.AlertService;
import hu.teszakt.homework.sonrisa.service.exception.AlertException;
import hu.teszakt.homework.sonrisa.service.mapper.AlertMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class AlertServiceImpl extends AbstractBaseService implements AlertService {

    private final AlertRepository alertRepository;
    private final UserRepository userRepository;
    private final AlertMapper alertMapper;

    @Override
    public AlertCreationResponse createAlert(@NonNull AlertCreationRequest request) {
        log.debug("Running createAlert service method for event: {}", request.getAlert().getAlertType());
        try {

            final AlertEntity entity = alertMapper.mapToAlertEntity(request);
            final UserEntity user = findUserById(request.getAlert().getUserId());
            entity.setUser(user);
            alertRepository.save(entity);

            log.debug("createAlert service method successfully finished");
            return new AlertCreationResponse(entity.getId());
        }
        catch (Exception ex) {
            throw new AlertException(ex.getMessage());
        }
    }

    private UserEntity findUserById(long userId) {
        return userRepository.findById(userId)
                             .orElseThrow(() -> new AlertException("No user exists with id: " + userId));
    }

}
