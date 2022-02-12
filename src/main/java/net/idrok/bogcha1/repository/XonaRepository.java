package net.idrok.bogcha1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Xona;

@Repository
public interface XonaRepository extends JpaRepository<Xona, Long> {
  Page<Xona> findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(String key, String key2, Pageable pageable);

}
