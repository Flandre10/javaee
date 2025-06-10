
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

import com.example.model.Rank;
import com.example.service.RankService;

@RestController
@RequestMapping("/api/rank")
public class RankController {

    @Autowired
    private RankService rankService;

    @GetMapping
    public ResponseEntity<List<Rank>> getAll() {
        return ResponseEntity.ok(rankService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rank> getById(@PathVariable Long id) {
        return ResponseEntity.ok(rankService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Rank rank) {
        rankService.insert(rank);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Rank rank) {
        rankService.update(rank);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        rankService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
}
