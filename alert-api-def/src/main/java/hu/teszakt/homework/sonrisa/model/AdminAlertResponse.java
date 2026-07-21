package hu.teszakt.homework.sonrisa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AdminAlertResponse implements Serializable {

    private Alert alert;

}
