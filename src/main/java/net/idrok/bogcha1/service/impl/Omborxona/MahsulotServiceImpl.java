package net.idrok.bogcha1.service.impl.Omborxona;

import net.idrok.bogcha1.service.Omborxona.MahsulotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Omborxona.Mahsulot;
import net.idrok.bogcha1.repository.Omborxona.MahsulotRepository;

@Service
public class MahsulotServiceImpl implements MahsulotService {
    
    @Autowired
    MahsulotRepository mahsulotRepository;

    public Page<Mahsulot> getAll(String key, Pageable pageable) {
        return mahsulotRepository.findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key, pageable);
    }

    @Override
    public Page<Mahsulot> getAll(Pageable pageable) {
        return null;
    }

    public Mahsulot getById(Long id) {
        return mahsulotRepository.findById(id).get();
    }

    public Mahsulot create(Mahsulot mahsulot) {
        if (mahsulot.getId() == null)
            return mahsulotRepository.save(mahsulot);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Mahsulot update(Mahsulot mahsulot) {
        if (mahsulot.getId() != null)
            return mahsulotRepository.save(mahsulot);
        return null;
    }

    public void delete(Mahsulot mahsulot) {

        mahsulotRepository.delete(mahsulot);
    }

    public void deleteById(Long id) {
        mahsulotRepository.deleteById(id);
    }

}
