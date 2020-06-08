package com.daji.service.impl;

import com.daji.mapper.CargoPolicyInfoMapper;
import com.daji.pojo.CargoPolicyInfo;
import com.daji.service.CargoPolicyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoPolicyInfoServiceImpl implements CargoPolicyInfoService {
    @Autowired
    private CargoPolicyInfoMapper cargoPolicyInfoMapper;
    @Override
    public List<CargoPolicyInfo> getAll() {
        return cargoPolicyInfoMapper.selectAll();
    }

    @Override
    public List<CargoPolicyInfo> getData(CargoPolicyInfo cargoPolicyInfo) {
        return cargoPolicyInfoMapper.select(cargoPolicyInfo);
    }

    @Override
    public CargoPolicyInfo getOne(CargoPolicyInfo cargoPolicyInfo) {
        return cargoPolicyInfoMapper.selectOne(cargoPolicyInfo);
    }

    @Override
    public Integer add(CargoPolicyInfo cargoPolicyInfo) {
        return cargoPolicyInfoMapper.insert(cargoPolicyInfo);
    }

    @Override
    public Integer del(CargoPolicyInfo cargoPolicyInfo) {
        return cargoPolicyInfoMapper.delete(cargoPolicyInfo);
    }

    @Override
    public Integer upd(CargoPolicyInfo cargoPolicyInfo) {
        return cargoPolicyInfoMapper.updateByPrimaryKey(cargoPolicyInfo);
    }
}
