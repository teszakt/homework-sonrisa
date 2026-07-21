package hu.teszakt.homework.sonrisa.service.impl;

import hu.teszakt.homework.sonrisa.model.UserCreationRequest;
import hu.teszakt.homework.sonrisa.model.UserCreationResponse;
import hu.teszakt.homework.sonrisa.service.AbstractBaseService;
import hu.teszakt.homework.sonrisa.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UserServiceImpl extends AbstractBaseService implements UserService {

    @Override
    public UserCreationResponse createUser(@NonNull UserCreationRequest name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
