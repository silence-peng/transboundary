package com.daji.service.impl;

import com.daji.mapper.BaggingManagementInfoMapper;
import com.daji.pojo.BaggingManagementInfo;
import com.daji.service.BaggingManagementInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaggingManagementInfoServiceImpl implements BaggingManagementInfoService {
    @Autowired
    private BaggingManagementInfoMapper baggingManagementInfoMapper;
    @Override
    public List<BaggingManagementInfo> getAll() {
        return baggingManagementInfoMapper.selectAll();
    }

    @Override
    public List<BaggingManagementInfo> getData(BaggingManagementInfo baggingManagementInfo) {
        return baggingManagementInfoMapper.select(baggingManagementInfo);
    }

    @Override
    public BaggingManagementInfo getOne(BaggingManagementInfo baggingManagementInfo) {
        return baggingManagementInfoMapper.selectOne(baggingManagementInfo);
    }

    @Override
    public Integer add(BaggingManagementInfo baggingManagementInfo) {
        return baggingManagementInfoMapper.insert(baggingManagementInfo);
    }

    @Override
    public Integer del(BaggingManagementInfo baggingManagementInfo) {
        return baggingManagementInfoMapper.delete(baggingManagementInfo);
    }

    @Override
    public Integer upd(BaggingManagementInfo baggingManagementInfo) {
        return baggingManagementInfoMapper.updateByPrimaryKey(baggingManagementInfo);
    }
}
