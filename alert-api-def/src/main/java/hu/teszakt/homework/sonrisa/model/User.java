package hu.teszakt.homework.sonrisa.model;

import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class User implements Serializable {

    @NonNull
    private String name;
    // optional connection datas
    @Email
    private String email;
    private String slack;

}
