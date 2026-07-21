package hu.teszakt.homework.sonrisa.db.entity;

import hu.teszakt.homework.sonrisa.model.enums.NotificationChannelType;
import hu.teszakt.homework.sonrisa.model.enums.NotificationDeliveryStatusType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Entity
@Table(name = "notification_delivery")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class NotificationDeliveryEntity extends AbstractEntity {

    @JoinColumn(name = "notification_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private NotificationEntity notification;
    @NotNull
    @Column(name = "channel_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private NotificationChannelType channelType;
    @NotNull
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private NotificationDeliveryStatusType status;
    @NotNull
    @Column(name = "sent_at", nullable = false)
    private OffsetDateTime sentAt;
    @Column(name = "failure_message")
    private String failureMessage;
    @Column(name = "attempts")
    private Long attempts;


}
