package net.idrok.bogcha1.service.Omborxona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Omborxona.Kirim;
import net.idrok.bogcha1.repository.Omborxona.KirimRepository;

@Service
public class KirimService {
    

    @Autowired
    KirimRepository kr;

    public Page<Kirim> getAll(String key, Pageable pageable) {
        return kr.findAllByInfoContainingIgnoreCase(key, pageable);
    }

    public Kirim getById(Long id) {
        return kr.findById(id).get();
    }
 
    public Kirim create(Kirim kirim) {
        if (kirim.getId() == null)
            return kr.save(kirim);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Kirim update(Kirim kirim) {
        if (kirim.getId() != null)
            return kr.save(kirim);
        return null;
    }

    public void delete(Kirim kirim) {

        kr.delete(kirim);
    }

    public void deleteById(Long id) {
        kr.deleteById(id);
    }

}
