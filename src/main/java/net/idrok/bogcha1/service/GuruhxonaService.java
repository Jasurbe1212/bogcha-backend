package net.idrok.bogcha1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import net.idrok.bogcha1.repository.GuruhxonaRepository;
import net.idrok.bogcha1.entity.Guruhxona;




@Service
public class GuruhxonaService {
    
     
    @Autowired
    GuruhxonaRepository guruhxonaRepository;

    
    public Page<Guruhxona> getAll(String key, Pageable pageable) {
        return guruhxonaRepository.findAllByInfoContainingIgnoreCase( key, pageable);
    }

    public Guruhxona getById(Long id) {
        return guruhxonaRepository.findById(id).get();
    }

    public Guruhxona create(Guruhxona guruhxona) {
        if (guruhxona.getId() == null)
            return guruhxonaRepository.save(guruhxona);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Guruhxona update(Guruhxona guruhxona) {
        if (guruhxona.getId() != null)
            return guruhxonaRepository.save(guruhxona);
        return null;
    }

    public void delete(Guruhxona guruhxona) {

        guruhxonaRepository.delete(guruhxona);
    }

    public void deleteById(Long id) {
        guruhxonaRepository.deleteById(id);
    }

}
