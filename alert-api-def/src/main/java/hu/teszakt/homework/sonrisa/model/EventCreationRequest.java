package hu.teszakt.homework.sonrisa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class EventCreationRequest extends AbstractRequest implements Serializable {

    @NonNull
    private Event event;

}
