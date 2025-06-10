// RankService.java
package com.example.service;
import java.util.List;

import com.example.model.Rank;
public interface RankService {
    List<Rank> getAll();
    Rank getById(Long id);
    void insert(Rank rank);
    void update(Rank rank);
    void deleteById(Long id);


    List<Rank> findAll();
}