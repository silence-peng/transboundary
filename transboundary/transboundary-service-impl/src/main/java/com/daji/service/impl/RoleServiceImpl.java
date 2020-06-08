package com.daji.service.impl;

import com.daji.mapper.RoleMapper;
import com.daji.pojo.Role;
import com.daji.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> getAll() {
        return roleMapper.selectAll();
    }

    @Override
    public List<Role> getData(Role role) {
        return roleMapper.select(role);
    }

    @Override
    public Role getOne(Role role) {
        return roleMapper.selectByPrimaryKey(role);
    }

    @Override
    public Integer add(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public Integer del(Role role) {
        return roleMapper.delete(role);
    }

    @Override
    public Integer upd(Role role) {
        return roleMapper.updateByPrimaryKey(role);
    }
}
