package hu.teszakt.homework.sonrisa.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class EventCreationResponse extends AbstractResponse implements Serializable {
}
