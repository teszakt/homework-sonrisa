package hu.teszakt.homework.sonrisa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public abstract class AbstractResponse implements Serializable {

    @NonNull
    private long id;

}
