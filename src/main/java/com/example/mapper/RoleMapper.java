
package com.example.mapper;

import com.example.model.Role;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface RoleMapper {
    List<Role> selectAll();
}
