package com.daji.service.impl;

import com.daji.mapper.WaybillChangesInfoMapper;
import com.daji.pojo.WaybillChangesInfo;
import com.daji.service.WaybillChangesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillChangesInfoServiceImpl implements WaybillChangesInfoService {
    @Autowired
    private WaybillChangesInfoMapper waybillChangesInfoMapper;
    @Override
    public List<WaybillChangesInfo> getAll() {
        return waybillChangesInfoMapper.selectAll();
    }

    @Override
    public List<WaybillChangesInfo> getData(WaybillChangesInfo waybillChangesInfo) {
        return waybillChangesInfoMapper.select(waybillChangesInfo);
    }

    @Override
    public WaybillChangesInfo getOne(WaybillChangesInfo waybillChangesInfo) {
        return waybillChangesInfoMapper.selectByPrimaryKey(waybillChangesInfo);
    }

    @Override
    public Integer add(WaybillChangesInfo waybillChangesInfo) {
        return waybillChangesInfoMapper.insert(waybillChangesInfo);
    }

    @Override
    public Integer del(WaybillChangesInfo waybillChangesInfo) {
        return waybillChangesInfoMapper.delete(waybillChangesInfo);
    }

    @Override
    public Integer upd(WaybillChangesInfo waybillChangesInfo) {
        return waybillChangesInfoMapper.updateByPrimaryKey(waybillChangesInfo);
    }
}
