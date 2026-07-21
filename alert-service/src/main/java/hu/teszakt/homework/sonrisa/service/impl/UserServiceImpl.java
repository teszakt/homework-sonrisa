package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.db.repository.UserRepository;
import hu.teszakt.homework.sonrisa.model.UserCreationRequest;
import hu.teszakt.homework.sonrisa.model.UserCreationResponse;
import hu.teszakt.homework.sonrisa.service.AbstractBaseService;
import hu.teszakt.homework.sonrisa.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl extends AbstractBaseService implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserCreationResponse createUser(@NonNull UserCreationRequest request) {
        log.debug("Running createUser service method for user: {}", request.getUser().getName());
        // TODO impl

        log.debug("createUser service method successfully finished");
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
