package net.idrok.bogcha1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import net.idrok.bogcha1.entity.Guruhxona;

public interface GuruhxonaRepository extends JpaRepository<Guruhxona, Long> {
 
    Page<Guruhxona> findAllByInfoContainingIgnoreCase(String key, Pageable pageable);
}
