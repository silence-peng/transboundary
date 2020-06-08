package com.daji.service.impl;

import com.daji.mapper.AccessoryInfoMapper;
import com.daji.pojo.AccessoryInfo;
import com.daji.service.AccessoryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessoryInfoServiceImpl implements AccessoryInfoService {

    @Autowired
    private AccessoryInfoMapper accessoryInfoMapper;

    @Override
    public List<AccessoryInfo> getAll() {
        return accessoryInfoMapper.selectAll();
    }

    @Override
    public List<AccessoryInfo> getData(AccessoryInfo accessoryInfo) {
        return accessoryInfoMapper.select(accessoryInfo);
    }

    @Override
    public AccessoryInfo getOne(AccessoryInfo accessoryInfo) {
        return accessoryInfoMapper.selectByPrimaryKey(accessoryInfo);
    }

    @Override
    public Integer add(AccessoryInfo accessoryInfo) {
        return accessoryInfoMapper.insert(accessoryInfo);
    }

    @Override
    public Integer del(AccessoryInfo accessoryInfo) {
        return accessoryInfoMapper.delete(accessoryInfo);
    }

    @Override
    public Integer upd(AccessoryInfo accessoryInfo) {
        return accessoryInfoMapper.updateByPrimaryKey(accessoryInfo);
    }
}
