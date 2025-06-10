// UserSpriteServiceImpl.java
package com.example.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserSpriteMapper;
import com.example.model.UserSprite;
import com.example.service.UserSpriteService;
@Service
public class UserSpriteServiceImpl implements UserSpriteService {
    @Autowired
    private UserSpriteMapper userSpriteMapper;
    @Override
    public List<UserSprite> getAll() {
        return userSpriteMapper.getAll();
    }
    @Override
    public UserSprite getById(Long id) {
        return userSpriteMapper.getById(id);
    }
    @Override
    public void insert(UserSprite userSprite) {
        userSpriteMapper.insert(userSprite);
    }
    @Override
    public void update(UserSprite userSprite) {
        userSpriteMapper.update(userSprite);
    }
    @Override
    public void deleteById(Long id) {
        userSpriteMapper.deleteById(id);
    }


    @Override
    public List<UserSprite> findAll() {
        return userSpriteMapper.selectAll();
    }
}
