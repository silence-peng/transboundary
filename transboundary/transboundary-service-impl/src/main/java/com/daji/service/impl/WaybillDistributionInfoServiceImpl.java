package com.daji.service.impl;

import com.daji.mapper.WaybillDistributionInfoMapper;
import com.daji.pojo.WaybillDistributionInfo;
import com.daji.service.WaybillDistributionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillDistributionInfoServiceImpl implements WaybillDistributionInfoService {
    @Autowired
    private WaybillDistributionInfoMapper waybillDistributionInfoMapper;
    @Override
    public List<WaybillDistributionInfo> getAll() {
        return waybillDistributionInfoMapper.selectAll();
    }

    @Override
    public List<WaybillDistributionInfo> getData(WaybillDistributionInfo waybillDistributionInfo) {
        return waybillDistributionInfoMapper.select(waybillDistributionInfo);
    }

    @Override
    public WaybillDistributionInfo getOne(WaybillDistributionInfo waybillDistributionInfo) {
        return waybillDistributionInfoMapper.selectOne(waybillDistributionInfo);
    }

    @Override
    public Integer add(WaybillDistributionInfo waybillDistributionInfo) {
        return waybillDistributionInfoMapper.insert(waybillDistributionInfo);
    }

    @Override
    public Integer del(WaybillDistributionInfo waybillDistributionInfo) {
        return waybillDistributionInfoMapper.delete(waybillDistributionInfo);
    }

    @Override
    public Integer upd(WaybillDistributionInfo waybillDistributionInfo) {
        return waybillDistributionInfoMapper.updateByPrimaryKey(waybillDistributionInfo);
    }
}
