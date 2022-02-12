package net.idrok.bogcha1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Lavozim;

@Repository
public interface LavozimRespository extends JpaRepository<Lavozim, Long> {
   // Page<Lavozim> findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(String key, Pageable pageable);

}
