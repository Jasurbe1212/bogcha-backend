package net.idrok.bogcha1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Xodim;
import net.idrok.bogcha1.repository.XodimRepository;

@Service
public class XodimService {

    @Autowired
    XodimRepository xodimRepository;

    public List<Xodim> getAll() {
        return xodimRepository.findAll();
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

    public void delete(Xodim xona) {

        xodimRepository.delete(xona);
    }

    public void deleteById(Long id) {
        xodimRepository.deleteById(id);
    }

}
