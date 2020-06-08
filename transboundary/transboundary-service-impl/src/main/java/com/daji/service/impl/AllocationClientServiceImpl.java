package com.daji.service.impl;

import com.daji.mapper.AllocationClientMapper;
import com.daji.pojo.AllocationClient;
import com.daji.service.AllocationClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationClientServiceImpl implements AllocationClientService {
    @Autowired
    private AllocationClientMapper allocationClientMapper;

    @Override
    public List<AllocationClient> getAll() {
        return allocationClientMapper.selectAll();
    }

    @Override
    public List<AllocationClient> getData(AllocationClient allocationClient) {
        return allocationClientMapper.select(allocationClient);
    }

    @Override
    public AllocationClient getOne(AllocationClient allocationClient) {
        return allocationClientMapper.selectByPrimaryKey(allocationClient);
    }

    @Override
    public Integer add(AllocationClient allocationClient) {
        return allocationClientMapper.insert(allocationClient);
    }

    @Override
    public Integer del(AllocationClient allocationClient) {
        return allocationClientMapper.delete(allocationClient);
    }

    @Override
    public Integer upd(AllocationClient allocationClient) {
        return allocationClientMapper.updateByPrimaryKey(allocationClient);
    }
}
