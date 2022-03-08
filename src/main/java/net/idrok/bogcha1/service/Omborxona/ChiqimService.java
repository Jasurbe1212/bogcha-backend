package net.idrok.bogcha1.service.Omborxona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Omborxona.Chiqim;
import net.idrok.bogcha1.repository.Omborxona.ChiqimRepository;

@Service
public class ChiqimService {

    @Autowired
    ChiqimRepository cq; 

    public Page<Chiqim> getAll(String key, Pageable pageable) {
        return cq.findAllByInfoContainingIgnoreCase( key, pageable);
    }

    public Chiqim getById(Long id) {
        return cq.findById(id).get();
    }

    public Chiqim create(Chiqim chiqim) {
        if (chiqim.getId() == null)
            return cq.save(chiqim);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Chiqim update(Chiqim chiqim) {
        if (chiqim.getId() != null)
            return cq.save(chiqim);
        return null;
    }

    public void delete(Chiqim chiqim) {

        cq.delete(chiqim);
    }

    public void deleteById(Long id) {
        cq.deleteById(id);
    }

    
}
