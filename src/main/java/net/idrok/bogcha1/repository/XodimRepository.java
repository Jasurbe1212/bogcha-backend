package net.idrok.bogcha1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Xodim;

@Repository
public interface XodimRepository extends JpaRepository<Xodim, Long> {

    Page<Xodim> findAllByIsmContainingIgnoreCaseOrFamilyaContainingIgnoreCase(String key,
            String key2, Pageable pageable);

}
