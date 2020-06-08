package com.daji.service.impl;

import com.daji.mapper.BranchTypeMapper;
import com.daji.pojo.BranchType;
import com.daji.service.BranchTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchTypeServiceImpl implements BranchTypeService {
    @Autowired
    private BranchTypeMapper branchTypeMapper;

    @Override
    public List<BranchType> getAll() {
        return branchTypeMapper.selectAll();
    }

    @Override
    public List<BranchType> getData(BranchType branchType) {
        return branchTypeMapper.select(branchType);
    }

    @Override
    public BranchType getOne(BranchType branchType) {
        return branchTypeMapper.selectByPrimaryKey(branchType);
    }

    @Override
    public Integer add(BranchType branchType) {
        return branchTypeMapper.insert(branchType);
    }

    @Override
    public Integer del(BranchType branchType) {
        return branchTypeMapper.delete(branchType);
    }

    @Override
    public Integer upd(BranchType branchType) {
        return branchTypeMapper.updateByPrimaryKey(branchType);
    }
}
