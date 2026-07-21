package hu.teszakt.homework.sonrisa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserCreationRequest extends AbstractRequest implements Serializable {

    @NonNull
    private String name;

}
