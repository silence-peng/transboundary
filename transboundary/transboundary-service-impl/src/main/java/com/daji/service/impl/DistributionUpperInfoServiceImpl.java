package com.daji.service.impl;

import com.daji.mapper.DistributionUpperInfoMapper;
import com.daji.pojo.DistributionUpperInfo;
import com.daji.service.DistributionUpperInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistributionUpperInfoServiceImpl implements DistributionUpperInfoService {
    @Autowired
    private DistributionUpperInfoMapper distributionUpperInfoMapper;
    @Override
    public List<DistributionUpperInfo> getAll() {
        return distributionUpperInfoMapper.selectAll();
    }

    @Override
    public List<DistributionUpperInfo> getData(DistributionUpperInfo distributionUpperInfo) {
        return distributionUpperInfoMapper.select(distributionUpperInfo);
    }

    @Override
    public DistributionUpperInfo getOne(DistributionUpperInfo distributionUpperInfo) {
        return distributionUpperInfoMapper.selectOne(distributionUpperInfo);
    }

    @Override
    public Integer add(DistributionUpperInfo distributionUpperInfo) {
        return distributionUpperInfoMapper.insert(distributionUpperInfo);
    }

    @Override
    public Integer del(DistributionUpperInfo distributionUpperInfo) {
        return distributionUpperInfoMapper.delete(distributionUpperInfo);
    }

    @Override
    public Integer upd(DistributionUpperInfo distributionUpperInfo) {
        return distributionUpperInfoMapper.updateByPrimaryKey(distributionUpperInfo);
    }
}
