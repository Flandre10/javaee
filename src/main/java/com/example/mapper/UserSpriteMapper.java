
package com.example.mapper;

import com.example.model.UserSprite;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserSpriteMapper {
    List<UserSprite> selectAll();
}
