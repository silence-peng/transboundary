package com.daji.service.impl;

import com.daji.mapper.BranchBasicsInfoMapper;
import com.daji.pojo.BranchBasicsInfo;
import com.daji.service.BranchBasicsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchBasicsInfoServiceImpl implements BranchBasicsInfoService {
    @Autowired
    private BranchBasicsInfoMapper branchBasicsInfoMapper;

    @Override
    public List<BranchBasicsInfo> getAll() {
        return branchBasicsInfoMapper.selectAll();
    }

    @Override
    public List<BranchBasicsInfo> getData(BranchBasicsInfo branchBasicsInfo) {
        return branchBasicsInfoMapper.select(branchBasicsInfo);
    }

    @Override
    public BranchBasicsInfo getOne(BranchBasicsInfo branchBasicsInfo) {
        return branchBasicsInfoMapper.selectByPrimaryKey(branchBasicsInfo);
    }

    @Override
    public Integer add(BranchBasicsInfo branchBasicsInfo) {
        return branchBasicsInfoMapper.insert(branchBasicsInfo);
    }

    @Override
    public Integer del(BranchBasicsInfo branchBasicsInfo) {
        return branchBasicsInfoMapper.delete(branchBasicsInfo);
    }

    @Override
    public Integer upd(BranchBasicsInfo branchBasicsInfo) {
        return branchBasicsInfoMapper.updateByPrimaryKey(branchBasicsInfo);
    }
}
