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

import net.idrok.bogcha1.entity.Xona;
import net.idrok.bogcha1.service.XonaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/api/xona")
@CrossOrigin(value = "http://localhost:4200", maxAge = 3600)
public class XonaController {

    @Autowired
    XonaService xonaService;

    @GetMapping()
    public ResponseEntity<Page<Xona>> getAll(@RequestParam(name = "key", required = false) String key,
            Pageable pageable) {
        if (key == null)
            key = "";
        return ResponseEntity.ok(xonaService.getAll(key ,pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Xona> getById(@PathVariable Long id) {
        return ResponseEntity.ok(xonaService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Xona> create(@RequestBody Xona xona) {
        // TODO: process POST request

        return ResponseEntity.ok(xonaService.create(xona));
    }

    @PutMapping()
    public ResponseEntity<Xona> update(@RequestBody Xona xona) {
        // TODO: process POST request

        return ResponseEntity.ok(xonaService.update(xona));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Xona> deleteById(@PathVariable Long id) {
        xonaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
