package hu.teszakt.homework.sonrisa.db.repository;

import hu.teszakt.homework.sonrisa.db.entity.AlertEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository<AlertEntity, Long> {
}
