// UserServiceImpl.java
package com.example.service.impl;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.service.UserService;
import com.example.util.JwtUtil;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
    @Override
    public User getById(Long id) {
        return userMapper.getById(id);
    }
    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
    @Override
    public void update(User user) {
        userMapper.update(user);
    }
    @Override
    public void deleteById(Long id) {
        userMapper.deleteById(id);
    }
    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
    @Override
    public User findByOpenid(String openid) {
        return userMapper.findByOpenid(openid);
    }
    @Override
    public String login(String username, String password, String openid) {
        User user = null;
        if (openid != null && !openid.isEmpty()) {
            user = findByOpenid(openid);
            if (user == null) {
                throw new RuntimeException("OpenID未绑定用户");
            }
        } else {
            user = findByUsername(username);
            if (user == null || !BCrypt.checkpw(password, user.getPassword())) {
                throw new RuntimeException("用户名或密码错误");
            }
        }
        return JwtUtil.generateToken(user);
    }
    @Override
    public void register(User user) {
        if (user.getPassword() != null && !user.getPassword().isEmpty()) {
            String encryptedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
            user.setPassword(encryptedPassword);
        }
        insert(user);
    }


    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
