package com.daji.mapper;

import com.daji.pojo.Role;
import org.springframework.stereotype.Repository;


@Repository("roleMapper")
public interface RoleMapper extends tk.mybatis.mapper.common.Mapper<Role> {
}
