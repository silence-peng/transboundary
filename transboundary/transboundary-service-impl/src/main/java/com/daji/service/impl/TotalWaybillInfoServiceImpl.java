package com.daji.service.impl;

import com.daji.mapper.TotalWaybillInfoMapper;
import com.daji.pojo.TotalWaybillInfo;
import com.daji.service.TotalWaybillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TotalWaybillInfoServiceImpl implements TotalWaybillInfoService {
    @Autowired
    private TotalWaybillInfoMapper totalWaybillInfoMapper;
    @Override
    public List<TotalWaybillInfo> getAll() {
        return totalWaybillInfoMapper.selectAll();
    }

    @Override
    public List<TotalWaybillInfo> getData(TotalWaybillInfo totalWaybillInfo) {
        return totalWaybillInfoMapper.select(totalWaybillInfo);
    }

    @Override
    public TotalWaybillInfo getOne(TotalWaybillInfo totalWaybillInfo) {
        return totalWaybillInfoMapper.selectOne(totalWaybillInfo);
    }

    @Override
    public Integer add(TotalWaybillInfo totalWaybillInfo) {
        return totalWaybillInfoMapper.insert(totalWaybillInfo);
    }

    @Override
    public Integer del(TotalWaybillInfo totalWaybillInfo) {
        return totalWaybillInfoMapper.delete(totalWaybillInfo);
    }

    @Override
    public Integer upd(TotalWaybillInfo totalWaybillInfo) {
        return totalWaybillInfoMapper.updateByPrimaryKey(totalWaybillInfo);
    }
}
