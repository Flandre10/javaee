// SpriteService.java
package com.example.service;
import java.util.List;

import com.example.model.Sprite;
public interface SpriteService {
    List<Sprite> getAll();
    Sprite getById(Long id);
    void insert(Sprite sprite);
    void update(Sprite sprite);
    void deleteById(Long id);


    List<Sprite> findAll();
}