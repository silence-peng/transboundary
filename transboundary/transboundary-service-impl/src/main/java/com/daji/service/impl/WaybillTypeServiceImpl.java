package com.daji.service.impl;

import com.daji.mapper.WaybillTypeMapper;
import com.daji.pojo.WaybillType;
import com.daji.service.WaybillTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillTypeServiceImpl implements WaybillTypeService {

    @Autowired
    private WaybillTypeMapper waybillTypeMapper;

    @Override
    public List<WaybillType> getAll() {
        return waybillTypeMapper.selectAll();
    }

    @Override
    public List<WaybillType> getData(WaybillType waybillType) {
        return waybillTypeMapper.select(waybillType);
    }

    @Override
    public WaybillType getOne(WaybillType waybillType) {
        return waybillTypeMapper.selectOne(waybillType);
    }

    @Override
    public Integer add(WaybillType waybillType) {
        return waybillTypeMapper.insert(waybillType);
    }

    @Override
    public Integer del(WaybillType waybillType) {
        return waybillTypeMapper.delete(waybillType);
    }

    @Override
    public Integer upd(WaybillType waybillType) {
        return waybillTypeMapper.updateByPrimaryKey(waybillType);
    }
}
