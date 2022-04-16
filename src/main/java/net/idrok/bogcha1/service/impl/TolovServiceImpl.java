package net.idrok.bogcha1.service.impl;
import net.idrok.bogcha1.service.TolovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Tolov;
import net.idrok.bogcha1.repository.TolovRepository;

@Service
public class TolovServiceImpl implements TolovService {
    
    @Autowired
    TolovRepository tolovRepository;

    public Page<Tolov> getAll(String key, Pageable pageable) {
        return tolovRepository.findAllByMiqdorContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key, pageable);
    }

    @Override
    public Page<Tolov> getAll(Pageable pageable) {
        return null;
    }

    public Tolov getById(Long id) {
        return tolovRepository.findById(id).get();
    }

    public Tolov create(Tolov tolov) {
        if (tolov.getId() == null)
            return tolovRepository.save(tolov);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Tolov update(Tolov tolov) {
        if (tolov.getId() != null)
            return tolovRepository.save(tolov);
        return null;
    }

    public void delete(Tolov tolov) {

        tolovRepository.delete(tolov);
    }

    public void deleteById(Long id) {
        tolovRepository.deleteById(id);
    }
}
