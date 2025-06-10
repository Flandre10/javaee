
package com.example.mapper;

import com.example.model.Sprite;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SpriteMapper {
    List<Sprite> selectAll();
}
