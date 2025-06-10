
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

import com.example.model.SystemLog;
import com.example.service.SystemLogService;

@RestController
@RequestMapping("/api/systemlog")
public class SystemLogController {

    @Autowired
    private SystemLogService systemLogService;

    @GetMapping
    public ResponseEntity<List<SystemLog>> getAll() {
        return ResponseEntity.ok(systemLogService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SystemLog> getById(@PathVariable Long id) {
        return ResponseEntity.ok(systemLogService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody SystemLog systemLog) {
        systemLogService.insert(systemLog);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody SystemLog systemLog) {
        systemLogService.update(systemLog);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        systemLogService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
}
