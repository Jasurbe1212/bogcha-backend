package net.idrok.bogcha1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Xodim;

@Repository
public interface XodimRepository extends JpaRepository<Xodim,Long> {

    
}
