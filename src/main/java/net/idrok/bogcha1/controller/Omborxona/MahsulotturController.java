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

import net.idrok.bogcha1.entity.Omborxona.Mahsulottur;
import net.idrok.bogcha1.service.Omborxona.MahsulotturService;

@Controller
@RequestMapping("/api/mahsulottur")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class MahsulotturController {
    
    @Autowired
    MahsulotturService mahsulotturService;
    @GetMapping()
    public ResponseEntity<Page<Mahsulottur>> getAll(@RequestParam(name = "key", required = false) String key ,Pageable pageable) {
        if(key == null) key = "";
        return ResponseEntity.ok(mahsulotturService.getAll(key ,pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mahsulottur> getById(@PathVariable Long id){
     return ResponseEntity.ok(mahsulotturService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Mahsulottur> create(@RequestBody Mahsulottur mahsulottur) {
        //TODO: process POST request
        
        return ResponseEntity.ok(mahsulotturService.create(mahsulottur));
    }
    @PutMapping()
    public ResponseEntity<Mahsulottur> update(@RequestBody Mahsulottur mahsulottur) {
        //TODO: process POST request
        
        return ResponseEntity.ok(mahsulotturService.update(mahsulottur));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Mahsulottur> deleteById(@PathVariable Long id){
        mahsulotturService.deleteById(id);
     return ResponseEntity.noContent().build();
    }
    
}
