package com.daji.service.impl;

import com.daji.mapper.ClearWarehouseInfoMapper;
import com.daji.pojo.ClearWarehouseInfo;
import com.daji.service.ClearWarehouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClearWarehouseInfoServiceImpl implements ClearWarehouseInfoService {
    @Autowired
    private ClearWarehouseInfoMapper clearWarehouseInfoMapper;
    @Override
    public List<ClearWarehouseInfo> getAll() {
        return clearWarehouseInfoMapper.selectAll();
    }

    @Override
    public List<ClearWarehouseInfo> getData(ClearWarehouseInfo clearWarehouseInfo) {
        return clearWarehouseInfoMapper.select(clearWarehouseInfo);
    }

    @Override
    public ClearWarehouseInfo getOne(ClearWarehouseInfo clearWarehouseInfo) {
        return clearWarehouseInfoMapper.selectOne(clearWarehouseInfo);
    }

    @Override
    public Integer add(ClearWarehouseInfo clearWarehouseInfo) {
        return clearWarehouseInfoMapper.insert(clearWarehouseInfo);
    }

    @Override
    public Integer del(ClearWarehouseInfo clearWarehouseInfo) {
        return clearWarehouseInfoMapper.delete(clearWarehouseInfo);
    }

    @Override
    public Integer upd(ClearWarehouseInfo clearWarehouseInfo) {
        return clearWarehouseInfoMapper.updateByPrimaryKey(clearWarehouseInfo);
    }
}
