package hu.teszakt.homework.sonrisa.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum AlertType {

    BREAKING_NEWS("breaking_news"),
    MARKET_MOVEMENT("market_movement"),
    NATURAL_DISASTER("natural_disaster");

    @Getter
    @JsonValue
    private final String value;

    AlertType(String value) {
        this.value = value;
    }


}
