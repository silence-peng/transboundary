package com.daji.service.impl;

import com.daji.mapper.BaggingDistributionInfoMapper;
import com.daji.pojo.BaggingDistributionInfo;
import com.daji.service.BaggingDistributionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaggingDistributionInfoServiceImpl implements BaggingDistributionInfoService {
    @Autowired
    private BaggingDistributionInfoMapper baggingDistributionInfoMapper;
    @Override
    public List<BaggingDistributionInfo> getAll() {
        return baggingDistributionInfoMapper.selectAll();
    }

    @Override
    public List<BaggingDistributionInfo> getData(BaggingDistributionInfo baggingDistributionInfo) {
        return baggingDistributionInfoMapper.select(baggingDistributionInfo);
    }

    @Override
    public BaggingDistributionInfo getOne(BaggingDistributionInfo baggingDistributionInfo) {
        return baggingDistributionInfoMapper.selectOne(baggingDistributionInfo);
    }

    @Override
    public Integer add(BaggingDistributionInfo baggingDistributionInfo) {
        return baggingDistributionInfoMapper.insert(baggingDistributionInfo);
    }

    @Override
    public Integer del(BaggingDistributionInfo baggingDistributionInfo) {
        return baggingDistributionInfoMapper.delete(baggingDistributionInfo);
    }

    @Override
    public Integer upd(BaggingDistributionInfo baggingDistributionInfo) {
        return baggingDistributionInfoMapper.updateByPrimaryKey(baggingDistributionInfo);
    }
}
