package hu.teszakt.homework.sonrisa.model.enums;

import hu.teszakt.homework.sonrisa.model.AbstractRequest;
import hu.teszakt.homework.sonrisa.model.Event;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class EventCreationRequest extends AbstractRequest implements Serializable {

    @NonNull
    private Event event;

}
