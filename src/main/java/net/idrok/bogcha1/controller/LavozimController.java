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

import net.idrok.bogcha1.entity.Lavozim;
import net.idrok.bogcha1.service.LavozimService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/api/lavozim")
@CrossOrigin(value = "http://localhost:4200", maxAge = 3600)
public class LavozimController {

    @Autowired
    LavozimService lavozimService;

    @GetMapping()
    public ResponseEntity<Page<Lavozim>> getAll( Pageable pageable) {
        // if (key == null)
        //     key = "";
        return ResponseEntity.ok(lavozimService.getAll( pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lavozim> getById(@PathVariable Long id) {
        return ResponseEntity.ok(lavozimService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Lavozim> create(@RequestBody Lavozim lavozim) {
        // TODO: process POST request

        return ResponseEntity.ok(lavozimService.create(lavozim));
    }

    @PutMapping()
    public ResponseEntity<Lavozim> update(@RequestBody Lavozim lavozim) {
        // TODO: process POST request

        return ResponseEntity.ok(lavozimService.update(lavozim));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Lavozim> deleteById(@PathVariable Long id) {
        lavozimService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
