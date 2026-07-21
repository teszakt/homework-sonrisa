package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.db.entity.UserEntity;
import hu.teszakt.homework.sonrisa.db.repository.UserRepository;
import hu.teszakt.homework.sonrisa.model.UserCreationRequest;
import hu.teszakt.homework.sonrisa.model.UserCreationResponse;
import hu.teszakt.homework.sonrisa.service.AbstractBaseService;
import hu.teszakt.homework.sonrisa.service.UserService;
import hu.teszakt.homework.sonrisa.service.exception.AlertException;
import hu.teszakt.homework.sonrisa.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl extends AbstractBaseService implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserCreationResponse createUser(@NonNull UserCreationRequest request) {
        log.debug("Running createUser service method for user: {}", request.getUser().getName());
        try {
            final UserEntity entity = userMapper.mapToUserEntity(request);
            userRepository.save(entity);

            log.debug("createUser service method successfully finished");
            return new UserCreationResponse(entity.getId());
        }
        catch (Exception ex) {
            throw new AlertException(ex.getMessage());
        }
    }

}
