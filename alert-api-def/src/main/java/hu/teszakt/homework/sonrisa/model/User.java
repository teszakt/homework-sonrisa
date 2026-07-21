package hu.teszakt.homework.sonrisa.model;

import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
public class User implements Serializable {

    @NonNull
    private String name;
    // optional connection datas
    @Email
    private String email;
    private String slack;

}
