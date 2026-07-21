package hu.teszakt.homework.sonrisa.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum AlertType {

    BREAKING_NEWS("breakingNews"),
    MARKET_MOVEMENT("marketMovement"),
    NATURAL_DISASTER("naturalDisaster");

    @Getter
    @JsonValue
    private final String value;

    AlertType(String value) {
        this.value = value;
    }


}
