package com.daji.service.impl;

import com.daji.mapper.UpperManagementInfoMapper;
import com.daji.pojo.UpperManagementInfo;
import com.daji.service.UpperManagementInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpperManagementInfoServiceImpl implements UpperManagementInfoService {
    @Autowired
    private UpperManagementInfoMapper upperManagementInfoMapper;
    @Override
    public List<UpperManagementInfo> getAll() {
        return upperManagementInfoMapper.selectAll();
    }

    @Override
    public List<UpperManagementInfo> getData(UpperManagementInfo upperManagementInfo) {
        return upperManagementInfoMapper.select(upperManagementInfo);
    }

    @Override
    public UpperManagementInfo getOne(UpperManagementInfo upperManagementInfo) {
        return upperManagementInfoMapper.selectOne(upperManagementInfo);
    }

    @Override
    public Integer add(UpperManagementInfo upperManagementInfo) {
        return upperManagementInfoMapper.insert(upperManagementInfo);
    }

    @Override
    public Integer del(UpperManagementInfo upperManagementInfo) {
        return upperManagementInfoMapper.delete(upperManagementInfo);
    }

    @Override
    public Integer upd(UpperManagementInfo upperManagementInfo) {
        return upperManagementInfoMapper.updateByPrimaryKey(upperManagementInfo);
    }
}
