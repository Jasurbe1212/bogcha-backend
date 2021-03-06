package net.idrok.bogcha1.service.impl;


import net.idrok.bogcha1.service.LavozimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Lavozim;
import net.idrok.bogcha1.repository.LavozimRespository;

@Service
public class LavozimServiceImpl implements LavozimService {

    @Autowired
    LavozimRespository lavozimRespository;

    public Page<Lavozim> getAll( Pageable pageable) {
        return lavozimRespository.findAll(pageable);

    }

    @Override
    public Page<Lavozim> getAll(String key, Pageable pageable) {
        return null;
    }

    public Lavozim getById(Long id) {
        return lavozimRespository.findById(id).get();
    }

    public Lavozim create(Lavozim lavozim) {
        if (lavozim.getId() == null)
            return lavozimRespository.save(lavozim);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Lavozim update(Lavozim lavozim) {
        if (lavozim.getId() != null)
            return lavozimRespository.save(lavozim);
        return null;
    }

    public void delete(Lavozim lavozim) {

        lavozimRespository.delete(lavozim);
    }

    public void deleteById(Long id) {
        lavozimRespository.deleteById(id);
    }

}
