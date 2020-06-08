package com.daji.service.impl;

import com.daji.mapper.WaybillTrackingMapper;
import com.daji.pojo.WaybillTracking;
import com.daji.service.WaybillTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillTrackingServiceImpl implements WaybillTrackingService {

    @Autowired
    private WaybillTrackingMapper waybillTrackingMapper;

    @Override
    public List<WaybillTracking> getAll() {
        return waybillTrackingMapper.selectAll();
    }

    @Override
    public List<WaybillTracking> getData(WaybillTracking waybillTracking) {
        return waybillTrackingMapper.select(waybillTracking);
    }

    @Override
    public WaybillTracking getOne(WaybillTracking waybillTracking) {
        return waybillTrackingMapper.selectOne(waybillTracking);
    }

    @Override
    public Integer add(WaybillTracking waybillTracking) {
        return waybillTrackingMapper.insert(waybillTracking);
    }

    @Override
    public Integer del(WaybillTracking waybillTracking) {
        return waybillTrackingMapper.delete(waybillTracking);
    }

    @Override
    public Integer upd(WaybillTracking waybillTracking) {
        return waybillTrackingMapper.updateByPrimaryKey(waybillTracking);
    }
}
