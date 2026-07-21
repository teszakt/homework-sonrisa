package hu.teszakt.homework.sonrisa.db.entity;

import hu.teszakt.homework.sonrisa.model.enums.AlertType;
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

import java.util.List;

@Entity
@Table(name = "alert")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class AlertEntity extends AbstractEntity {

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;
    @NotNull
    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private AlertType alertType;
    @NotNull
    @Column(name = "criteria", nullable = false)
    private String criteria;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "alert")
    private List<NotificationEntity> notifications;


}
