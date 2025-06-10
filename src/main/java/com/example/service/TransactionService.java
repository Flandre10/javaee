// TransactionService.java
package com.example.service;
import java.util.List;

import com.example.model.Transaction;
public interface TransactionService {
    List<Transaction> getAll();
    Transaction getById(Long id);
    void insert(Transaction transaction);
    void update(Transaction transaction);
    void deleteById(Long id);


    List<Transaction> findAll();
}