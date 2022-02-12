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

import net.idrok.bogcha1.entity.Xonatur;
import net.idrok.bogcha1.service.XonaturService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api/xonatur")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class XonaturController {
    
    @Autowired
    XonaturService xonaturService;


    @GetMapping()
    public ResponseEntity<Page<Xonatur>> getAll(@RequestParam(name = "key", required = false) String key ,Pageable pageable) {
        if(key == null) key = "";
        return ResponseEntity.ok(xonaturService.getAll(key ,pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Xonatur> getById(@PathVariable Long id){
     return ResponseEntity.ok(xonaturService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Xonatur> create(@RequestBody Xonatur xonatur) {
        //TODO: process POST request
        
        return ResponseEntity.ok(xonaturService.create(xonatur));
    }
    @PutMapping()
    public ResponseEntity<Xonatur> update(@RequestBody Xonatur xonatur) {
        //TODO: process POST request
        
        return ResponseEntity.ok(xonaturService.update(xonatur));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Xonatur> deleteById(@PathVariable Long id){
        xonaturService.deleteById(id);
     return ResponseEntity.noContent().build();
    }
    

}
