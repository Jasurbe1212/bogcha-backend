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

import net.idrok.bogcha1.entity.Omborxona.Yetkazuvchi;
import net.idrok.bogcha1.service.Omborxona.YetkazuvchiService;

@Controller
@RequestMapping("/api/yetkazuvchi")
@CrossOrigin (value = "http://localhost:4200", maxAge = 3600)
public class YetkazuvchiController {
    
    @Autowired
    YetkazuvchiService yt;

    @GetMapping()
    public ResponseEntity<Page<Yetkazuvchi>> getAll(@RequestParam(name = "key", required = false) String key ,Pageable pageable) {
        if(key == null) key = "";
        return ResponseEntity.ok(yt.getAll(key ,pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Yetkazuvchi> getById(@PathVariable Long id){
     return ResponseEntity.ok(yt.getById(id));
    }

    @PostMapping()
    public ResponseEntity<Yetkazuvchi> create(@RequestBody Yetkazuvchi yetkazuvchi) {
        //TODO: process POST request
        
        return ResponseEntity.ok(yt.create(yetkazuvchi));
    }
    @PutMapping()
    public ResponseEntity<Yetkazuvchi> update(@RequestBody Yetkazuvchi yetkazuvchi) {
        //TODO: process POST request
        
        return ResponseEntity.ok(yt.update(yetkazuvchi));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Yetkazuvchi> deleteById(@PathVariable Long id){
        yt.deleteById(id);
     return ResponseEntity.noContent().build();
    }
    
}
