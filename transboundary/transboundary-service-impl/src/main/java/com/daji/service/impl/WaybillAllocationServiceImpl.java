package com.daji.service.impl;

import com.daji.mapper.VerigyTypeMapper;
import com.daji.mapper.WaybillAllocationMapper;
import com.daji.pojo.VerifyType;
import com.daji.pojo.WaybillAllocation;
import com.daji.service.VerigyTypeService;
import com.daji.service.WaybillAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillAllocationServiceImpl implements WaybillAllocationService {

    @Autowired
    private WaybillAllocationMapper waybillAllocationMapper;


    @Override
    public List<WaybillAllocation> getAll() {
        return waybillAllocationMapper.selectAll();
    }

    @Override
    public List<WaybillAllocation> getData(WaybillAllocation waybillAllocation) {
        return waybillAllocationMapper.select(waybillAllocation);
    }

    @Override
    public WaybillAllocation getOne(WaybillAllocation waybillAllocation) {
        return waybillAllocationMapper.selectOne(waybillAllocation);
    }

    @Override
    public Integer add(WaybillAllocation waybillAllocation) {
        return waybillAllocationMapper.insert(waybillAllocation);
    }

    @Override
    public Integer del(WaybillAllocation waybillAllocation) {
        return waybillAllocationMapper.delete(waybillAllocation);
    }

    @Override
    public Integer upd(WaybillAllocation waybillAllocation) {
        return waybillAllocationMapper.updateByPrimaryKey(waybillAllocation);
    }
}
