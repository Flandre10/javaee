// RoleServiceImpl.java
package com.example.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.RoleMapper;
import com.example.model.Role;
import com.example.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> getAll() {
        return roleMapper.getAll();
    }
    @Override
    public Role getById(Long id) {
        return roleMapper.getById(id);
    }
    @Override
    public void insert(Role role) {
        roleMapper.insert(role);
    }
    @Override
    public void update(Role role) {
        roleMapper.update(role);
    }
    @Override
    public void deleteById(Long id) {
        roleMapper.deleteById(id);
    }


    @Override
    public List<Role> findAll() {
        return roleMapper.selectAll();
    }
}
