package hu.teszakt.homework.sonrisa.db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

import java.io.Serializable;

@MappedSuperclass
@Data
public class AbstractEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name = "id")
    private Long id;

}
