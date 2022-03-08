package net.idrok.bogcha1.repository.Omborxona;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Omborxona.Kirim;

@Repository
public interface KirimRepository extends JpaRepository<Kirim,Long> {
    // Page<Kirim> findAllByVaqtContainingIgnoreCaseOrInfoContainingIgnoreCase(String key,
    //   String key2, Pageable pageable);

    Page<Kirim> findAllByInfoContainingIgnoreCase(String key, Pageable pageable);
}
