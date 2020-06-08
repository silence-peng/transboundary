package com.daji.service.impl;

import com.daji.mapper.PackTypeInfoMapper;
import com.daji.pojo.PackTypeInfo;
import com.daji.service.PackTypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackTypeInfoServiceImpl implements PackTypeInfoService {
    @Autowired
    private PackTypeInfoMapper packTypeInfoMapper;
    @Override
    public List<PackTypeInfo> getAll() {
        return packTypeInfoMapper.selectAll();
    }

    @Override
    public List<PackTypeInfo> getData(PackTypeInfo packTypeInfo) {
        return packTypeInfoMapper.select(packTypeInfo);
    }

    @Override
    public PackTypeInfo getOne(PackTypeInfo packTypeInfo) {
        return packTypeInfoMapper.selectByPrimaryKey(packTypeInfo);
    }

    @Override
    public Integer add(PackTypeInfo packTypeInfo) {
        return packTypeInfoMapper.insert(packTypeInfo);
    }

    @Override
    public Integer del(PackTypeInfo packTypeInfo) {
        return packTypeInfoMapper.delete(packTypeInfo);
    }

    @Override
    public Integer upd(PackTypeInfo packTypeInfo) {
        return packTypeInfoMapper.updateByPrimaryKey(packTypeInfo);
    }
}
