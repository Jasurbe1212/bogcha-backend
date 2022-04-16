package net.idrok.bogcha1.service.impl;
import net.idrok.bogcha1.service.TolovturService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Tolovtur;
import net.idrok.bogcha1.repository.TolovturRepository;

@Service
public class TolovturServiceImpl implements TolovturService {
    @Autowired
    TolovturRepository tolovturRepository;

    public Page<Tolovtur> getAll(String key, Pageable pageable) {
        return tolovturRepository.findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key, pageable);
    }

    @Override
    public Page<Tolovtur> getAll(Pageable pageable) {
        return null;
    }

    public Tolovtur getById(Long id) {
        return tolovturRepository.findById(id).get();
    }

    public Tolovtur create(Tolovtur tolovtur) {
        if (tolovtur.getId() == null)
            return tolovturRepository.save(tolovtur);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Tolovtur update(Tolovtur tolovtur) {
        if (tolovtur.getId() != null)
            return tolovturRepository.save(tolovtur);
        return null;
    }

    public void delete(Tolovtur tolovtur) {

        tolovturRepository.delete(tolovtur);
    }

    public void deleteById(Long id) {
        tolovturRepository.deleteById(id);
    }
}
