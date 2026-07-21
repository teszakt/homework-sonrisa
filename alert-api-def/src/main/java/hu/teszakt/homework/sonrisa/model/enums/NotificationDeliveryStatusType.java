package hu.teszakt.homework.sonrisa.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum NotificationDeliveryStatusType {

    PENDING("pending"),
    SENT("sent"),
    FAILED("failed"),
    RETRYING("retrying");

    @Getter
    @JsonValue
    private final String value;

    NotificationDeliveryStatusType(String value) {
        this.value = value;
    }

}
