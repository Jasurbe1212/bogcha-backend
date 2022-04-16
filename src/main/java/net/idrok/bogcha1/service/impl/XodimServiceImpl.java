package net.idrok.bogcha1.service.impl;

import net.idrok.bogcha1.service.XodimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Xodim;
import net.idrok.bogcha1.repository.XodimRepository;

@Service
public class XodimServiceImpl implements XodimService {

    @Autowired
    XodimRepository xodimRepository;

    public Page<Xodim> getAll(String key, Pageable pageable) {
        return xodimRepository.findAllByIsmContainingIgnoreCaseOrFamilyaContainingIgnoreCase(key, key, pageable);
    }

    @Override
    public Page<Xodim> getAll(Pageable pageable) {
        return null;
    }

    public Xodim getById(Long id) {
        return xodimRepository.findById(id).get();
    }

    public Xodim create(Xodim xodim) {
        if (xodim.getId() == null)
            return xodimRepository.save(xodim);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Xodim update(Xodim xodim) {
        if (xodim.getId() != null)
            return xodimRepository.save(xodim);
        return null;
    }

    public void delete(Xodim xodim) {

        xodimRepository.delete(xodim);
    }

    public void deleteById(Long id) {
        xodimRepository.deleteById(id);
    }

}
