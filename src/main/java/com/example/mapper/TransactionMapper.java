
package com.example.mapper;

import com.example.model.Transaction;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface TransactionMapper {
    List<Transaction> selectAll();
}
