package net.idrok.bogcha1.repository;

import net.idrok.bogcha1.entity.Fayl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaylRepository extends JpaRepository<Fayl, Long> {
}
