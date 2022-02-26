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

import net.idrok.bogcha1.entity.Guruhxona;
import net.idrok.bogcha1.service.GuruhxonaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/api/guruhxona")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class GuruhxonaController {

    @Autowired
    GuruhxonaService guruhxonaService;

    @GetMapping()
    public ResponseEntity<Page<Guruhxona>> getAll(@RequestParam(name = "key", required = false) String key,
            Pageable pageable) {
        if (key == null)
            key = "";
        return ResponseEntity.ok(guruhxonaService.getAll(key, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guruhxona> getById(@PathVariable Long id) {
        return ResponseEntity.ok(guruhxonaService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Guruhxona> create(@RequestBody Guruhxona guruhxona) {
        // TODO: process POST request

        return ResponseEntity.ok(guruhxonaService.create(guruhxona));
    }

    @PutMapping()
    public ResponseEntity<Guruhxona> update(@RequestBody Guruhxona guruhxona) {
        // TODO: process POST request

        return ResponseEntity.ok(guruhxonaService.update(guruhxona));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Guruhxona> deleteById(@PathVariable Long id) {
        guruhxonaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    
}
