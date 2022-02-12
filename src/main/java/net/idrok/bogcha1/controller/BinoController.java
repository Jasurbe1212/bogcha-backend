package net.idrok.bogcha1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.idrok.bogcha1.entity.Bino;
import net.idrok.bogcha1.service.BinoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api/bino")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class BinoController {
    
    @Autowired
    BinoService binoService;


    @GetMapping()
    public ResponseEntity<Page<Bino>> getAll(@RequestParam(name = "key", required = false) String key ,Pageable pageable) {
        if(key == null) key = "";
        return ResponseEntity.ok(binoService.getAll(key ,pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Bino> getById(@PathVariable Long id){
     return ResponseEntity.ok(binoService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Bino> create(@RequestBody Bino bino) {
        //TODO: process POST request
        
        return ResponseEntity.ok(binoService.create(bino));
    }
    @PutMapping()
    public ResponseEntity<Bino> update(@RequestBody Bino bino) {
        //TODO: process POST request
        
        return ResponseEntity.ok(binoService.update(bino));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bino> deleteById(@PathVariable Long id){
        binoService.deleteById(id);
     return ResponseEntity.noContent().build();
    }
    

}
