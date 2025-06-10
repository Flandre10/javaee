// BattleRecordService.java
package com.example.service;
import java.util.List;

import com.example.model.BattleRecord;
public interface BattleRecordService {
    List<BattleRecord> getAll();
    BattleRecord getById(Long id);
    void insert(BattleRecord record);
    void update(BattleRecord record);
    void deleteById(Long id);


    List<BattleRecord> findAll();
}