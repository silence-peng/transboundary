package com.daji.service.impl;

import com.daji.mapper.ChildClearWarehouseInfoMapper;
import com.daji.pojo.ChildClearWarehouseInfo;
import com.daji.service.ChildClearWarehouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildClearWarehouseInfoServiceImpl implements ChildClearWarehouseInfoService {
    @Autowired
    private ChildClearWarehouseInfoMapper childClearWarehouseInfoMapper;
    @Override
    public List<ChildClearWarehouseInfo> getAll() {
        return childClearWarehouseInfoMapper.selectAll();
    }

    @Override
    public List<ChildClearWarehouseInfo> getData(ChildClearWarehouseInfo childClearWarehouseInfo) {
        return childClearWarehouseInfoMapper.select(childClearWarehouseInfo);
    }

    @Override
    public ChildClearWarehouseInfo getOne(ChildClearWarehouseInfo childClearWarehouseInfo) {
        return childClearWarehouseInfoMapper.selectOne(childClearWarehouseInfo);
    }

    @Override
    public Integer add(ChildClearWarehouseInfo childClearWarehouseInfo) {
        return childClearWarehouseInfoMapper.insert(childClearWarehouseInfo);
    }

    @Override
    public Integer del(ChildClearWarehouseInfo childClearWarehouseInfo) {
        return childClearWarehouseInfoMapper.delete(childClearWarehouseInfo);
    }

    @Override
    public Integer upd(ChildClearWarehouseInfo childClearWarehouseInfo) {
        return childClearWarehouseInfoMapper.updateByPrimaryKey(childClearWarehouseInfo);
    }
}
