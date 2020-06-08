package com.daji.service.impl;

import com.daji.mapper.ChildOrdersInfoMapper;
import com.daji.pojo.ChildOrdersInfo;
import com.daji.service.ChildOrdersInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildOrdersInfoServiceImpl implements ChildOrdersInfoService {
    @Autowired
    private ChildOrdersInfoMapper childOrdersInfoMapper;
    @Override
    public List<ChildOrdersInfo> getAll() {
        return childOrdersInfoMapper.selectAll();
    }

    @Override
    public List<ChildOrdersInfo> getData(ChildOrdersInfo childOrdersInfo) {
        return childOrdersInfoMapper.select(childOrdersInfo);
    }

    @Override
    public ChildOrdersInfo getOne(ChildOrdersInfo childOrdersInfo) {
        return childOrdersInfoMapper.selectByPrimaryKey(childOrdersInfo);
    }

    @Override
    public Integer add(ChildOrdersInfo childOrdersInfo) {
        return childOrdersInfoMapper.insert(childOrdersInfo);
    }

    @Override
    public Integer del(ChildOrdersInfo childOrdersInfo) {
        return childOrdersInfoMapper.delete(childOrdersInfo);
    }

    @Override
    public Integer upd(ChildOrdersInfo childOrdersInfo) {
        return childOrdersInfoMapper.updateByPrimaryKey(childOrdersInfo);
    }
}
