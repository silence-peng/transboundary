package com.daji.service.impl;

import com.daji.mapper.UseInfoMapper;
import com.daji.mapper.UserMapper;
import com.daji.pojo.UseInfo;
import com.daji.pojo.User;
import com.daji.service.UseInfoService;
import com.daji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> getData(User user) {
        return userMapper.select(user);
    }

    @Override
    public User getOne(User user) {
        return userMapper.selectOne(user);
    }

    @Override
    public Integer add(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Integer del(User user) {
        return userMapper.delete(user);
    }

    @Override
    public Integer upd(User user) {
        return userMapper.updateByPrimaryKey(user);
    }
}
