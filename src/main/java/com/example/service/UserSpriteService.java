// UserSpriteService.java
package com.example.service;
import java.util.List;

import com.example.model.UserSprite;
public interface UserSpriteService {
    List<UserSprite> getAll();
    UserSprite getById(Long id);
    void insert(UserSprite userSprite);
    void update(UserSprite userSprite);
    void deleteById(Long id);


    List<UserSprite> findAll();
}