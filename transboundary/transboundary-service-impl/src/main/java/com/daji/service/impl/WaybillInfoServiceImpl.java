package com.daji.service.impl;

import com.daji.mapper.WaybillInfoMapper;
import com.daji.pojo.WaybillInfo;
import com.daji.service.WaybillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillInfoServiceImpl implements WaybillInfoService {
    @Autowired
    private WaybillInfoMapper waybillInfoMapper;
    @Override
    public List<WaybillInfo> getAll() {
        return waybillInfoMapper.selectAll();
    }

    @Override
    public List<WaybillInfo> getData(WaybillInfo waybillInfo) {
        return waybillInfoMapper.select(waybillInfo);
    }

    @Override
    public WaybillInfo getOne(WaybillInfo waybillInfo) {
        return waybillInfoMapper.selectByPrimaryKey(waybillInfo);
    }

    @Override
    public Integer add(WaybillInfo waybillInfo) {
        return waybillInfoMapper.insert(waybillInfo);
    }

    @Override
    public Integer del(WaybillInfo waybillInfo) {
        return waybillInfoMapper.delete(waybillInfo);
    }

    @Override
    public Integer upd(WaybillInfo waybillInfo) {
        return waybillInfoMapper.updateByPrimaryKey(waybillInfo);
    }
}
