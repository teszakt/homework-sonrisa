package hu.teszakt.homework.sonrisa.db.entity;

import hu.teszakt.homework.sonrisa.model.enums.AlertType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Entity
@Table(name = "event")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class EventEntity extends AbstractEntity {

    @NotNull
    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    private AlertType alertType;
    @NotNull
    @Column(name = "message", nullable = false)
    private String message;
    @NotNull
    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

}
