// BattleRecordServiceImpl.java
package com.example.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.BattleRecordMapper;
import com.example.model.BattleRecord;
import com.example.service.BattleRecordService;
@Service
public class BattleRecordServiceImpl implements BattleRecordService {
    @Autowired
    private BattleRecordMapper battleRecordMapper;
    @Override
    public List<BattleRecord> getAll() {
        return battleRecordMapper.getAll();
    }
    @Override
    public BattleRecord getById(Long id) {
        return battleRecordMapper.getById(id);
    }
    @Override
    public void insert(BattleRecord record) {
        battleRecordMapper.insert(record);
    }
    @Override
    public void update(BattleRecord record) {
        battleRecordMapper.update(record);
    }
    @Override
    public void deleteById(Long id) {
        battleRecordMapper.deleteById(id);
    }


    @Override
    public List<BattleRecord> findAll() {
        return battleRecordMapper.selectAll();
    }
}
