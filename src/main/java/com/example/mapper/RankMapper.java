
package com.example.mapper;

import com.example.model.Rank;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface RankMapper {
    List<Rank> selectAll();
}
