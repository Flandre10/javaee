// TransactionServiceImpl.java
package com.example.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.TransactionMapper;
import com.example.model.Transaction;
import com.example.service.TransactionService;
@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionMapper transactionMapper;
    @Override
    public List<Transaction> getAll() {
        return transactionMapper.getAll();
    }
    @Override
    public Transaction getById(Long id) {
        return transactionMapper.getById(id);
    }
    @Override
    public void insert(Transaction transaction) {
        transactionMapper.insert(transaction);
    }
    @Override
    public void update(Transaction transaction) {
        transactionMapper.update(transaction);
    }
    @Override
    public void deleteById(Long id) {
        transactionMapper.deleteById(id);
    }


    @Override
    public List<Transaction> findAll() {
        return transactionMapper.selectAll();
    }
}
