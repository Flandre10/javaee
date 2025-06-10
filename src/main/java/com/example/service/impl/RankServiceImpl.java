// RankServiceImpl.java
package com.example.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.RankMapper;
import com.example.model.Rank;
import com.example.service.RankService;
@Service
public class RankServiceImpl implements RankService {
    @Autowired
    private RankMapper rankMapper;
    @Override
    public List<Rank> getAll() {
        return rankMapper.getAll();
    }
    @Override
    public Rank getById(Long id) {
        return rankMapper.getById(id);
    }
    @Override
    public void insert(Rank rank) {
        rankMapper.insert(rank);
    }
    @Override
    public void update(Rank rank) {
        rankMapper.update(rank);
    }
    @Override
    public void deleteById(Long id) {
        rankMapper.deleteById(id);
    }


    @Override
    public List<Rank> findAll() {
        return rankMapper.selectAll();
    }
}
