package com.daji.service.impl;

import com.daji.mapper.CustomsClearanceInfoMapper;
import com.daji.pojo.CustomsClearanceInfo;
import com.daji.service.CustomsClearanceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomsClearanceInfoServiceImpl implements CustomsClearanceInfoService {
    @Autowired
    private CustomsClearanceInfoMapper customsClearanceInfoMapper;
    @Override
    public List<CustomsClearanceInfo> getAll() {
        return customsClearanceInfoMapper.selectAll();
    }

    @Override
    public List<CustomsClearanceInfo> getData(CustomsClearanceInfo customsClearanceInfo) {
        return customsClearanceInfoMapper.select(customsClearanceInfo);
    }

    @Override
    public CustomsClearanceInfo getOne(CustomsClearanceInfo customsClearanceInfo) {
        return customsClearanceInfoMapper.selectOne(customsClearanceInfo);
    }

    @Override
    public Integer add(CustomsClearanceInfo customsClearanceInfo) {
        return customsClearanceInfoMapper.insert(customsClearanceInfo);
    }

    @Override
    public Integer del(CustomsClearanceInfo customsClearanceInfo) {
        return customsClearanceInfoMapper.delete(customsClearanceInfo);
    }

    @Override
    public Integer upd(CustomsClearanceInfo customsClearanceInfo) {
        return customsClearanceInfoMapper.updateByPrimaryKey(customsClearanceInfo);
    }
}
