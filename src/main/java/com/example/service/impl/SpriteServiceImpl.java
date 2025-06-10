// SpriteServiceImpl.java
package com.example.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.SpriteMapper;
import com.example.model.Sprite;
import com.example.service.SpriteService;
@Service
public class SpriteServiceImpl implements SpriteService {
    @Autowired
    private SpriteMapper spriteMapper;
    @Override
    public List<Sprite> getAll() {
        return spriteMapper.getAll();
    }
    @Override
    public Sprite getById(Long id) {
        return spriteMapper.getById(id);
    }
    @Override
    public void insert(Sprite sprite) {
        spriteMapper.insert(sprite);
    }
    @Override
    public void update(Sprite sprite) {
        spriteMapper.update(sprite);
    }
    @Override
    public void deleteById(Long id) {
        spriteMapper.deleteById(id);
    }


    @Override
    public List<Sprite> findAll() {
        return spriteMapper.selectAll();
    }
}
