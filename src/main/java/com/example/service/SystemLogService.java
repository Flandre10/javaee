// SystemLogService.java
package com.example.service;
import java.util.List;

import com.example.model.SystemLog;
public interface SystemLogService {
    List<SystemLog> getAll();
    SystemLog getById(Long id);
    void insert(SystemLog log);
    void update(SystemLog log);
    void deleteById(Long id);


    List<SystemLog> findAll();
}