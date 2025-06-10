// SystemLogServiceImpl.java
package com.example.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.SystemLogMapper;
import com.example.model.SystemLog;
import com.example.service.SystemLogService;
@Service
public class SystemLogServiceImpl implements SystemLogService {
    @Autowired
    private SystemLogMapper systemLogMapper;
    @Override
    public List<SystemLog> getAll() {
        return systemLogMapper.getAll();
    }
    @Override
    public SystemLog getById(Long id) {
        return systemLogMapper.getById(id);
    }
    @Override
    public void insert(SystemLog log) {
        systemLogMapper.insert(log);
    }
    @Override
    public void update(SystemLog log) {
        systemLogMapper.update(log);
    }
    @Override
    public void deleteById(Long id) {
        systemLogMapper.deleteById(id);
    }


    @Override
    public List<SystemLog> findAll() {
        return systemLogMapper.selectAll();
    }
}
