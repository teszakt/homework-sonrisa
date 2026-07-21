package hu.teszakt.homework.sonrisa.service;

import hu.teszakt.homework.sonrisa.model.UserCreationRequest;
import hu.teszakt.homework.sonrisa.model.UserCreationResponse;
import org.springframework.lang.NonNull;

public interface UserService {

    UserCreationResponse createUser(@NonNull UserCreationRequest name);

}
