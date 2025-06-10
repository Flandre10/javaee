// RoleService.java
package com.example.service;
import java.util.List;

import com.example.model.Role;
public interface RoleService {
    List<Role> getAll();
    Role getById(Long id);
    void insert(Role role);
    void update(Role role);
    void deleteById(Long id);


    List<Role> findAll();
}