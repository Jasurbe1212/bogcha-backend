package net.idrok.bogcha1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Bino;
import net.idrok.bogcha1.repository.BinoRepository;

@Service
public class BinoService {

    @Autowired
    BinoRepository binoRepository;

    public Page<Bino> getAll(String key, Pageable pageable) {
        return binoRepository.findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key , pageable);
    }

    public Bino getById(Long id) {
        return binoRepository.findById(id).get();
    }

    public Bino create(Bino bino) {
        if (bino.getId() == null)
            return binoRepository.save(bino);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Bino update(Bino bino) {
        if (bino.getId() != null)
            return binoRepository.save(bino);
        return null;
    }

    public void delete(Bino bino) {

        binoRepository.delete(bino);
    }

    public void deleteById(Long id) {
        binoRepository.deleteById(id);
    }

}
