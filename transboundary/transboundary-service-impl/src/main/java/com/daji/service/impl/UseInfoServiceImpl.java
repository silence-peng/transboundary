package com.daji.service.impl;

import com.daji.mapper.UpdatePlateMapper;
import com.daji.mapper.UseInfoMapper;
import com.daji.pojo.UpdatePlate;
import com.daji.pojo.UseInfo;
import com.daji.service.UpdatePlateService;
import com.daji.service.UseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseInfoServiceImpl implements UseInfoService {

    @Autowired
    private UseInfoMapper useInfoMapper;

    @Override
    public List<UseInfo> getAll() {
        return useInfoMapper.selectAll();
    }

    @Override
    public List<UseInfo> getData(UseInfo useInfo) {
        return useInfoMapper.select(useInfo);
    }

    @Override
    public UseInfo getOne(UseInfo useInfo) {
        return useInfoMapper.selectOne(useInfo);
    }

    @Override
    public Integer add(UseInfo useInfo) {
        return useInfoMapper.insert(useInfo);
    }

    @Override
    public Integer del(UseInfo useInfo) {
        return useInfoMapper.delete(useInfo);
    }

    @Override
    public Integer upd(UseInfo useInfo) {
        return useInfoMapper.updateByPrimaryKey(useInfo);
    }
}
