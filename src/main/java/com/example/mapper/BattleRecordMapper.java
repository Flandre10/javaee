
package com.example.mapper;

import com.example.model.BattleRecord;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BattleRecordMapper {
    List<BattleRecord> selectAll();
}
