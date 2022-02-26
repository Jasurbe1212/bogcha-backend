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

import net.idrok.bogcha1.entity.Guruh;
import net.idrok.bogcha1.service.GuruhService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/api/guruh")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class GuruhController {

    @Autowired
    GuruhService guruhService;

    @GetMapping()
    public ResponseEntity<Page<Guruh>> getAll(@RequestParam(name = "key", required = false) String key,
            Pageable pageable) {
        if (key == null)
            key = "";
        return ResponseEntity.ok(guruhService.getAll(key, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guruh> getById(@PathVariable Long id) {
        return ResponseEntity.ok(guruhService.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Guruh> create(@RequestBody Guruh guruh) {
        // TODO: process POST request

        return ResponseEntity.ok(guruhService.create(guruh));
    }

    @PutMapping()
    public ResponseEntity<Guruh> update(@RequestBody Guruh guruh) {
        // TODO: process POST request

        return ResponseEntity.ok(guruhService.update(guruh));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Guruh> deleteById(@PathVariable Long id) {
        guruhService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    
}
