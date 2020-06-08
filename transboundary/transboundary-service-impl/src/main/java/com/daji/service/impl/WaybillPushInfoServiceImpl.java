package com.daji.service.impl;

import com.daji.mapper.WaybillPushInfoMapper;
import com.daji.pojo.WaybillPushInfo;
import com.daji.service.WaybillPushInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillPushInfoServiceImpl implements WaybillPushInfoService {
    @Autowired
    private WaybillPushInfoMapper waybillPushInfoMapper;
    @Override
    public List<WaybillPushInfo> getAll() {
        return waybillPushInfoMapper.selectAll();
    }

    @Override
    public List<WaybillPushInfo> getData(WaybillPushInfo waybillPushInfo) {
        return waybillPushInfoMapper.select(waybillPushInfo);
    }

    @Override
    public WaybillPushInfo getOne(WaybillPushInfo waybillPushInfo) {
        return waybillPushInfoMapper.selectByPrimaryKey(waybillPushInfo);
    }

    @Override
    public Integer add(WaybillPushInfo waybillPushInfo) {
        return waybillPushInfoMapper.insert(waybillPushInfo);
    }

    @Override
    public Integer del(WaybillPushInfo waybillPushInfo) {
        return waybillPushInfoMapper.delete(waybillPushInfo);
    }

    @Override
    public Integer upd(WaybillPushInfo waybillPushInfo) {
        return waybillPushInfoMapper.updateByPrimaryKey(waybillPushInfo);
    }
}
