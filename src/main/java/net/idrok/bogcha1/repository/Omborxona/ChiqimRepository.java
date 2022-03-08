package net.idrok.bogcha1.repository.Omborxona;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Omborxona.Chiqim;

@Repository
public interface ChiqimRepository extends JpaRepository<Chiqim,Long> {
    
    Page<Chiqim> findAllByInfoContainingIgnoreCase(String key, Pageable pageable);
}
