package net.idrok.bogcha1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.idrok.bogcha1.entity.Xodim;
import net.idrok.bogcha1.service.XodimService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api/xodim")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class XodimController {
    
    @Autowired
    XodimService xodimService;


    @GetMapping()
    public ResponseEntity<List<Xodim>> getAll(){
     return ResponseEntity.ok(xodimService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Xodim> getById(@PathVariable Long id){
     return ResponseEntity.ok(xodimService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Xodim> create(@RequestBody Xodim xodim) {
        //TODO: process POST request
        
        return ResponseEntity.ok(xodimService.create(xodim));
    }
    @PutMapping()
    public ResponseEntity<Xodim> update(@RequestBody Xodim xodim) {
        //TODO: process POST request
        
        return ResponseEntity.ok(xodimService.update(xodim));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Xodim> deleteById(@PathVariable Long id){
        xodimService.deleteById(id);
     return ResponseEntity.noContent().build();
    }
    

}
