package hu.teszakt.homework.sonrisa.db.entity;

import hu.teszakt.homework.sonrisa.model.enums.NotificationStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "notification")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class NotificationEntity extends AbstractEntity {

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;
    @JoinColumn(name = "alert_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private AlertEntity alert;
    @NotNull
    @Column(name = "message", nullable = false)
    private String message;
    @NotNull
    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;
    @NotNull
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private NotificationStatus status;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "notification")
    private List<NotificationDeliveryEntity> deliveries;

}
