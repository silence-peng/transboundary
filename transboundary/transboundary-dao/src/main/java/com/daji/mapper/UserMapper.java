package com.daji.mapper;

import com.daji.pojo.User;
import org.springframework.stereotype.Repository;


@Repository("userMapper")
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
