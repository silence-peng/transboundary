package com.daji.service.impl;

import com.daji.mapper.DeptMapper;
import com.daji.pojo.Dept;
import com.daji.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getAll() {
        return deptMapper.selectAll();
    }

    @Override
    public List<Dept> getData(Dept dept) {
        return deptMapper.select(dept);
    }

    @Override
    public Dept getOne(Dept dept) {
        return deptMapper.selectByPrimaryKey(dept);
    }

    @Override
    public Integer add(Dept dept) {
        return deptMapper.insert(dept);
    }

    @Override
    public Integer del(Dept dept) {
        return deptMapper.delete(dept);
    }

    @Override
    public Integer upd(Dept dept) {
        return deptMapper.updateByPrimaryKey(dept);
    }
}
