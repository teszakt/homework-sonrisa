package hu.teszakt.homework.sonrisa.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "user")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class UserEntity extends AbstractEntity {

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "slack")
    private String slack;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<AlertEntity> alerts;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<NotificationEntity> notifications;

}
