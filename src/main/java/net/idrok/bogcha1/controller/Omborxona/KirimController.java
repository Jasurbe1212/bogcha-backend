package net.idrok.bogcha1.controller.Omborxona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.idrok.bogcha1.entity.Omborxona.Kirim;
import net.idrok.bogcha1.service.Omborxona.KirimService;

@Controller
@RequestMapping("/api/kirim")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class KirimController {

    @Autowired
    KirimService kirimService;

    @GetMapping()
    public ResponseEntity<Page<Kirim>> getAll(@RequestParam(name = "key", required = false) String key ,Pageable pageable) {
        if(key == null) key = "";
        return ResponseEntity.ok(kirimService.getAll(key ,pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Kirim> getById(@PathVariable Long id){
     return ResponseEntity.ok(kirimService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Kirim> create(@RequestBody Kirim kirim) {
        //TODO: process POST request
        
        return ResponseEntity.ok(kirimService.create(kirim));
    }
    @PutMapping()
    public ResponseEntity<Kirim> update(@RequestBody Kirim kirim) {
        //TODO: process POST request
        
        return ResponseEntity.ok(kirimService.update(kirim));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Kirim> deleteById(@PathVariable Long id){
        kirimService.deleteById(id);
     return ResponseEntity.noContent().build();
    }
    
    
}
