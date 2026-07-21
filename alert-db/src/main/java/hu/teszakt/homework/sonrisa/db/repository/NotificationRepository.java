package hu.teszakt.homework.sonrisa.db.repository;

import hu.teszakt.homework.sonrisa.db.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity, Long> {
}
