package net.idrok.bogcha1.repository.Omborxona;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Omborxona.Mahsulot;

@Repository
public interface MahsulotRepository extends JpaRepository<Mahsulot,Long> {
    
    Page<Mahsulot> findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(String key,
      String key2, Pageable pageable);
}
