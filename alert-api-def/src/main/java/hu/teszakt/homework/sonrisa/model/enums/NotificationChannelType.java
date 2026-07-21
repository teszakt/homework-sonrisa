package hu.teszakt.homework.sonrisa.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum NotificationChannelType {

    EMAIL("email"),
    SLACK("slack");

    @Getter
    @JsonValue
    private final String value;

    NotificationChannelType(String value) {
        this.value = value;
    }


}
