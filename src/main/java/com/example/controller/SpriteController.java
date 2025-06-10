
package com.example.controller;

import java.util.List;

import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Sprite;
import com.example.service.SpriteService;

@RestController
@RequestMapping("/api/sprite")
public class SpriteController {

    @Autowired
    private SpriteService spriteService;

    @GetMapping
    public ResponseEntity<List<Sprite>> getAll() {
        return ResponseEntity.ok(spriteService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sprite> getById(@PathVariable Long id) {
        return ResponseEntity.ok(spriteService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Sprite sprite) {
        spriteService.insert(sprite);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Sprite sprite) {
        spriteService.update(sprite);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        spriteService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
}
