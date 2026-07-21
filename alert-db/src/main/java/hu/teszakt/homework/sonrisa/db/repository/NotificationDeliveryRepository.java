package hu.teszakt.homework.sonrisa.db.repository;

import hu.teszakt.homework.sonrisa.db.entity.NotificationDeliveryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationDeliveryRepository extends JpaRepository<NotificationDeliveryEntity, Long> {
}
