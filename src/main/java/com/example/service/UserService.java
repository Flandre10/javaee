// UserService.java
package com.example.service;
import java.util.List;

import com.example.model.User;
public interface UserService {
    List<User> getAll();
    User getById(Long id);
    void insert(User user);
    void update(User user);
    void deleteById(Long id);

    User findByUsername(String username);
    User findByOpenid(String openid);
    String login(String username, String password, String openid);
    void register(User user);


    List<User> findAll();
}