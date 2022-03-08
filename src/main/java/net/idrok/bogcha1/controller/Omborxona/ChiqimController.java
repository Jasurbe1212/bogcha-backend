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

import net.idrok.bogcha1.entity.Omborxona.Chiqim;
import net.idrok.bogcha1.service.Omborxona.ChiqimService;

@Controller
@RequestMapping("/api/chiqim")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class ChiqimController {
    

    @Autowired
    ChiqimService cs;

    @GetMapping()
    public ResponseEntity<Page<Chiqim>> getAll(@RequestParam(name = "key", required = false) String key ,Pageable pageable) {
        if(key == null) key = "";
        return ResponseEntity.ok(cs.getAll(key ,pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Chiqim> getById(@PathVariable Long id){
     return ResponseEntity.ok(cs.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Chiqim> create(@RequestBody Chiqim chiqim) {
        //TODO: process POST request
        
        return ResponseEntity.ok(cs.create(chiqim));
    }
    @PutMapping()
    public ResponseEntity<Chiqim> update(@RequestBody Chiqim chiqim) {
        //TODO: process POST request
        
        return ResponseEntity.ok(cs.update(chiqim));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Chiqim> deleteById(@PathVariable Long id){
        cs.deleteById(id);
     return ResponseEntity.noContent().build();
    }
    

}
