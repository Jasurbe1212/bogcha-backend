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

import net.idrok.bogcha1.entity.Omborxona.Mahsulot;
import net.idrok.bogcha1.service.Omborxona.MahsulotService;

@Controller
@RequestMapping("/api/mahsulot")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class MahsulotController {
    
    @Autowired
    MahsulotService mahsulotService;
    @GetMapping()
    public ResponseEntity<Page<Mahsulot>> getAll(@RequestParam(name = "key", required = false) String key ,Pageable pageable) {
        if(key == null) key = "";
        return ResponseEntity.ok(mahsulotService.getAll(key ,pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mahsulot> getById(@PathVariable Long id){
     return ResponseEntity.ok(mahsulotService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Mahsulot> create(@RequestBody Mahsulot mahsulot) {
        //TODO: process POST request
        
        return ResponseEntity.ok(mahsulotService.create(mahsulot));
    }
    @PutMapping()
    public ResponseEntity<Mahsulot> update(@RequestBody Mahsulot mahsulot) {
        //TODO: process POST request
        
        return ResponseEntity.ok(mahsulotService.update(mahsulot));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Mahsulot> deleteById(@PathVariable Long id){
        mahsulotService.deleteById(id);
     return ResponseEntity.noContent().build();
    }
    
}
