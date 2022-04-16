package net.idrok.bogcha1.service.impl.Omborxona;

import net.idrok.bogcha1.service.Omborxona.YetkazuvchiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.idrok.bogcha1.entity.Omborxona.Yetkazuvchi;
import net.idrok.bogcha1.repository.Omborxona.YetkazuvchiRepository;

@Service
public class YetkazuvchiServiceImpl implements YetkazuvchiService {
  
    @Autowired
    YetkazuvchiRepository yt;

    public Page<Yetkazuvchi> getAll(String key, Pageable pageable) {
        return yt.findAllByNomContainingIgnoreCaseOrManzilContainingIgnoreCase(key, key, pageable);
    }

    @Override
    public Page<Yetkazuvchi> getAll(Pageable pageable) {
        return null;
    }

    public Yetkazuvchi getById(Long id) {
        return yt.findById(id).get();
    }

    public Yetkazuvchi create(Yetkazuvchi yetkazuvchi) {
        if (yetkazuvchi.getId() == null)
            return yt.save(yetkazuvchi);

        throw new RuntimeException("Xatolik null bolishi shart ");
    }

    public Yetkazuvchi update(Yetkazuvchi yetkazuvchi) {
        if (yetkazuvchi.getId() != null)
            return yt.save(yetkazuvchi);
        return null;
    }

    public void delete(Yetkazuvchi yetkazuvchi) {

        yt.delete(yetkazuvchi);
    }

    public void deleteById(Long id) {
        yt.deleteById(id);
    }
    
}
