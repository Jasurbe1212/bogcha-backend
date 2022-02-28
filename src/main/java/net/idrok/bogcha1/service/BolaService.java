package net.idrok.bogcha1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Bola;
import net.idrok.bogcha1.repository.BolaRepository;

@Service
public class BolaService {
    @Autowired
    BolaRepository bolaRepository;

    public Page<Bola> getAll(String key, Pageable pageable) {
        return bolaRepository.findAllByIsmContainingIgnoreCaseOrFamilyaContainingIgnoreCase(key, key, pageable);
    }

     public Bola getById(Long id) {
        return bolaRepository.findById(id).get();
    }

    public Bola create(Bola bola) {
        if (bola.getId() == null)
            return bolaRepository.save(bola);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Bola update(Bola bola) {
        if (bola.getId() != null)
            return bolaRepository.save(bola);
        return null;
    }

    public void delete(Bola bola) {

        bolaRepository.delete(bola);
    }

    public void deleteById(Long id) {
        bolaRepository.deleteById(id);
    }

}
