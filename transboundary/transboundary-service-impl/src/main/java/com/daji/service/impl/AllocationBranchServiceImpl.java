package com.daji.service.impl;

import com.daji.mapper.AllocationBranchMapper;
import com.daji.pojo.AllocationBranch;
import com.daji.service.AllocationBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationBranchServiceImpl implements AllocationBranchService {

    @Autowired
    private AllocationBranchMapper allocationBranchMapper;

    @Override
    public List<AllocationBranch> getAll() {
        return allocationBranchMapper.selectAll();
    }

    @Override
    public List<AllocationBranch> getData(AllocationBranch allocationBranch) {
        return allocationBranchMapper.select(allocationBranch);
    }

    @Override
    public AllocationBranch getOne(AllocationBranch allocationBranch) {
        return allocationBranchMapper.selectByPrimaryKey(allocationBranch);
    }

    @Override
    public Integer add(AllocationBranch allocationBranch) {
        return allocationBranchMapper.insert(allocationBranch);
    }

    @Override
    public Integer del(AllocationBranch allocationBranch) {
        return allocationBranchMapper.delete(allocationBranch);
    }

    @Override
    public Integer upd(AllocationBranch allocationBranch) {
        return allocationBranchMapper.updateByPrimaryKey(allocationBranch);
    }
}
