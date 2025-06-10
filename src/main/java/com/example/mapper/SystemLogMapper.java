
package com.example.mapper;

import com.example.model.SystemLog;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SystemLogMapper {
    List<SystemLog> selectAll();
}
