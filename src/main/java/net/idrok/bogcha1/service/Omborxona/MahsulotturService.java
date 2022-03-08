package net.idrok.bogcha1.service.Omborxona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Omborxona.Mahsulottur;
import net.idrok.bogcha1.repository.Omborxona.MahsulotturRepository;

@Service
public class MahsulotturService {

      
    @Autowired
    MahsulotturRepository mahsulotturRepository;

    public Page<Mahsulottur> getAll(String key, Pageable pageable) {
        return mahsulotturRepository.findAllByNomContainingIgnoreCaseOrInfoContainingIgnoreCase(key, key, pageable);
    }

    public Mahsulottur getById(Long id) {
        return mahsulotturRepository.findById(id).get();
    }

    public Mahsulottur create(Mahsulottur mahsulottur) {
        if (mahsulottur.getId() == null)
            return mahsulotturRepository.save(mahsulottur);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Mahsulottur update(Mahsulottur mahsulottur) {
        if (mahsulottur.getId() != null)
            return mahsulotturRepository.save(mahsulottur);
        return null;
    }

    public void delete(Mahsulottur mahsulottur) {

        mahsulotturRepository.delete(mahsulottur);
    }

    public void deleteById(Long id) {
        mahsulotturRepository.deleteById(id);
    }
}
