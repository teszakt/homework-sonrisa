package hu.teszakt.homework.sonrisa.db.repository;

import hu.teszakt.homework.sonrisa.db.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {



}
