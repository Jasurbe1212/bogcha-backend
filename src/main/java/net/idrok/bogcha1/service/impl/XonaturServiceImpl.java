package net.idrok.bogcha1.service.impl;


import net.idrok.bogcha1.service.XonaturService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Xonatur;
import net.idrok.bogcha1.repository.XonaturRepository;

@Service
public class XonaturServiceImpl implements XonaturService {

    @Autowired
    XonaturRepository xonaturRepository;

    public Page<Xonatur> getAll(String key, Pageable pageable) {
        return xonaturRepository.findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key , pageable);

    }

    @Override
    public Page<Xonatur> getAll(Pageable pageable) {
        return null;
    }

    public Xonatur getById(Long id) {
        return xonaturRepository.findById(id).get();
    }

    public Xonatur create(Xonatur xonatur) {
        if (xonatur.getId() == null)
            return xonaturRepository.save(xonatur);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Xonatur update(Xonatur xonatur) {
        if (xonatur.getId() != null)
            return xonaturRepository.save(xonatur);
        return null;
    }

    public void delete(Xonatur xonatur) {

        xonaturRepository.delete(xonatur);
    }

    public void deleteById(Long id) {
        xonaturRepository.deleteById(id);
    }

}
