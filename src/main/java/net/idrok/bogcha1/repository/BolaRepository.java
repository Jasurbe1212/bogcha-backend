package net.idrok.bogcha1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Bola;
import net.idrok.bogcha1.entity.Bolajins;

@Repository 
public interface BolaRepository extends JpaRepository<Bola, Long> {
    
    
    Page<Bola> findAllByIsmContainingIgnoreCaseOrFamilyaContainingIgnoreCase(String key,
            String key2, Pageable pageable);

    Page<Bola> findByBolajins(Bolajins bolajins,Pageable pageable);

    default Page<Bola> findByBolajinsUGIL(Bolajins bolajins,Pageable pageable){
        return this.findByBolajins(Bolajins.UGIL, pageable);
    }
    default Page<Bola> findByBolajinsQIZ(Bolajins bolajins,Pageable pageable){
        return this.findByBolajins(Bolajins.QIZ, pageable);
    }



}
