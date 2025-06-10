
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

import com.example.model.UserSprite;
import com.example.service.UserSpriteService;

@RestController
@RequestMapping("/api/usersprite")
public class UserSpriteController {

    @Autowired
    private UserSpriteService userSpriteService;

    @GetMapping
    public ResponseEntity<List<UserSprite>> getAll() {
        return ResponseEntity.ok(userSpriteService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserSprite> getById(@PathVariable Long id) {
        return ResponseEntity.ok(userSpriteService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody UserSprite userSprite) {
        userSpriteService.insert(userSprite);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody UserSprite userSprite) {
        userSpriteService.update(userSprite);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userSpriteService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
}
