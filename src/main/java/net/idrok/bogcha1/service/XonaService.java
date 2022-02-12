package net.idrok.bogcha1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Xona;
import net.idrok.bogcha1.repository.XonaRepository;

@Service
public class XonaService {

    @Autowired
    XonaRepository xonaRepository;

    public Page<Xona> getAll(String key, Pageable pageable) {
        return xonaRepository.findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key, pageable);
    }

    public Xona getById(Long id) {
        return xonaRepository.findById(id).get();
    }

    public Xona create(Xona xona) {
        if (xona.getId() == null)
            return xonaRepository.save(xona);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Xona update(Xona xona) {
        if (xona.getId() != null)
            return xonaRepository.save(xona);
        return null;
    }

    public void delete(Xona xona) {

        xonaRepository.delete(xona);
    }

    public void deleteById(Long id) {
        xonaRepository.deleteById(id);
    }

}
