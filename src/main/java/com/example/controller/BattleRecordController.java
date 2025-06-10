
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

import com.example.model.BattleRecord;
import com.example.service.BattleRecordService;

@RestController
@RequestMapping("/api/battlerecord")
public class BattleRecordController {

    @Autowired
    private BattleRecordService battleRecordService;

    @GetMapping
    public ResponseEntity<List<BattleRecord>> getAll() {
        return ResponseEntity.ok(battleRecordService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BattleRecord> getById(@PathVariable Long id) {
        return ResponseEntity.ok(battleRecordService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody BattleRecord battleRecord) {
        battleRecordService.insert(battleRecord);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody BattleRecord battleRecord) {
        battleRecordService.update(battleRecord);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        battleRecordService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
}
