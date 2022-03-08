package net.idrok.bogcha1.repository.Omborxona;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Omborxona.Mahsulottur;

@Repository
public interface MahsulotturRepository extends JpaRepository<Mahsulottur,Long> {
    
    Page<Mahsulottur> findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(String key,
      String key2, Pageable pageable);
}
