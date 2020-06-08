package com.daji.service.impl;

import com.daji.mapper.WaybillAutomaticallyMapper;
import com.daji.mapper.WaybillNumberMapper;
import com.daji.pojo.WaybillAutomatically;
import com.daji.pojo.WaybillNumber;
import com.daji.service.WaybillAutomaticallyService;
import com.daji.service.WaybillNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillNumberServiceImpl implements WaybillNumberService {

    @Autowired
    private WaybillNumberMapper waybillNumberMapper;


    @Override
    public List<WaybillNumber> getAll() {
        return waybillNumberMapper.selectAll();
    }

    @Override
    public List<WaybillNumber> getData(WaybillNumber waybillNumber) {
        return waybillNumberMapper.select(waybillNumber);
    }

    @Override
    public WaybillNumber getOne(WaybillNumber waybillNumber) {
        return waybillNumberMapper.selectOne(waybillNumber);
    }

    @Override
    public Integer add(WaybillNumber waybillNumber) {
        return waybillNumberMapper.insert(waybillNumber);
    }

    @Override
    public Integer del(WaybillNumber waybillNumber) {
        return waybillNumberMapper.delete(waybillNumber);
    }

    @Override
    public Integer upd(WaybillNumber waybillNumber) {
        return waybillNumberMapper.updateByPrimaryKey(waybillNumber);
    }
}
