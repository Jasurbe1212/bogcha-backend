package net.idrok.bogcha1.service.impl;

import net.idrok.bogcha1.service.GuruhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import net.idrok.bogcha1.repository.GuruhRepository;
import net.idrok.bogcha1.entity.Guruh;




@Service
public class GuruhServiceImpl implements GuruhService {
    
    @Autowired
    GuruhRepository guruhRepository;

    
    public Page<Guruh> getAll(String key, Pageable pageable) {
        return guruhRepository.findAllByNomContainingIgnoreCase( key, pageable);
    }

    @Override
    public Page<Guruh> getAll(Pageable pageable) {
        return null;
    }

    public Guruh getById(Long id) {
        return guruhRepository.findById(id).get();
    }

    public Guruh create(Guruh guruh) {
        if (guruh.getId() == null)
            return guruhRepository.save(guruh);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Guruh update(Guruh guruh) {
        if (guruh.getId() != null)
            return guruhRepository.save(guruh);
        return null;
    }

    public void delete(Guruh guruh) {

        guruhRepository.delete(guruh);
    }

    public void deleteById(Long id) {
        guruhRepository.deleteById(id);
    }

}
