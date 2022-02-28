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

import net.idrok.bogcha1.entity.Bola;
import net.idrok.bogcha1.service.BolaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/api/bola")
@CrossOrigin(value = "http://localhost:4200", maxAge = 3600)
public class BolaController {
    
    @Autowired
    BolaService bolaService;

    @GetMapping()
    public ResponseEntity<Page<Bola>> getAll(@RequestParam(name = "key", required = false) String key,
            Pageable pageable) {
        if (key == null)
            key = "";
        return ResponseEntity.ok(bolaService.getAll(key, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bola> getById(@PathVariable Long id) {
        return ResponseEntity.ok(bolaService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Bola> create(@RequestBody Bola bola) {
        // TODO: process POST request

        return ResponseEntity.ok(bolaService.create(bola));
    }

    @PutMapping()
    public ResponseEntity<Bola> update(@RequestBody Bola bola) {
        // TODO: process POST request

        return ResponseEntity.ok(bolaService.update(bola));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bola> deleteById(@PathVariable Long id) {
        bolaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    
}
