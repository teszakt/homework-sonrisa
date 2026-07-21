package hu.teszakt.homework.sonrisa.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor(force = true)
public abstract class AbstractResponse implements Serializable {

    @NonNull
    private long id;

    protected AbstractResponse(long id) {
        this.id = id;
    }

}
