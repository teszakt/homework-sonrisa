package hu.teszakt.homework.sonrisa.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum NotificationStatusType {

    CREATED("created"),
    IN_PROGRESS("inProgress"),
    COMPLETED("completed"),
    PARTIAL_FAILURE("partialFailure"),
    FAILURE("failure");

    @Getter
    @JsonValue
    private final String value;

    NotificationStatusType(String value) {
        this.value = value;
    }

}
