package net.idrok.bogcha1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Guruh;

@Repository
public interface GuruhRepository extends JpaRepository<Guruh, Long> {

    
  Page<Guruh> findAllByNomContainingIgnoreCase(String key, Pageable pageable);


}
