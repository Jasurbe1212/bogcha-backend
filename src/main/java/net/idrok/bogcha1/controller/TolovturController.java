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

import net.idrok.bogcha1.entity.Tolovtur;
import net.idrok.bogcha1.service.TolovturService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api/tolovtur")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class TolovturController {
    @Autowired
    TolovturService ts;


    @GetMapping()
    public ResponseEntity<Page<Tolovtur>> getAll(@RequestParam(name = "key", required = false) String key ,Pageable pageable) {
        if(key == null) key = "";
        return ResponseEntity.ok(ts.getAll(key ,pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Tolovtur> getById(@PathVariable Long id){
     return ResponseEntity.ok(ts.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Tolovtur> create(@RequestBody Tolovtur tolovtur) {
        //TODO: process POST request
        
        return ResponseEntity.ok(ts.create(tolovtur));
    }
    @PutMapping()
    public ResponseEntity<Tolovtur> update(@RequestBody Tolovtur tolovtur) {
        //TODO: process POST request
        
        return ResponseEntity.ok(ts.update(tolovtur));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Tolovtur> deleteById(@PathVariable Long id){
        ts.deleteById(id);
     return ResponseEntity.noContent().build();
    }
    
}
