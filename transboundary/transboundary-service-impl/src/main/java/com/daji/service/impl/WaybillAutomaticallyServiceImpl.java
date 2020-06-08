package com.daji.service.impl;

import com.daji.mapper.WaybillAllocationMapper;
import com.daji.mapper.WaybillAutomaticallyMapper;
import com.daji.pojo.WaybillAllocation;
import com.daji.pojo.WaybillAutomatically;
import com.daji.service.WaybillAllocationService;
import com.daji.service.WaybillAutomaticallyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillAutomaticallyServiceImpl implements WaybillAutomaticallyService {

    @Autowired
    private WaybillAutomaticallyMapper waybillAutomaticallyMapper;

    @Override
    public List<WaybillAutomatically> getAll() {
        return waybillAutomaticallyMapper.selectAll();
    }

    @Override
    public List<WaybillAutomatically> getData(WaybillAutomatically waybillAutomatically) {
        return waybillAutomaticallyMapper.select(waybillAutomatically);
    }

    @Override
    public WaybillAutomatically getOne(WaybillAutomatically waybillAutomatically) {
        return waybillAutomaticallyMapper.selectOne(waybillAutomatically);
    }

    @Override
    public Integer add(WaybillAutomatically waybillAutomatically) {
        return waybillAutomaticallyMapper.insert(waybillAutomatically);
    }

    @Override
    public Integer del(WaybillAutomatically waybillAutomatically) {
        return waybillAutomaticallyMapper.delete(waybillAutomatically);
    }

    @Override
    public Integer upd(WaybillAutomatically waybillAutomatically) {
        return waybillAutomaticallyMapper.updateByPrimaryKey(waybillAutomatically);
    }
}
