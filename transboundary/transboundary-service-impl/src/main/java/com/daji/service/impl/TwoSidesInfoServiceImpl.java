package com.daji.service.impl;

import com.daji.mapper.TwoSidesInfoMapper;
import com.daji.pojo.TwoSidesInfo;
import com.daji.service.TwoSidesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwoSidesInfoServiceImpl implements TwoSidesInfoService {
    @Autowired
    private TwoSidesInfoMapper twoSidesInfoMapper;
    @Override
    public List<TwoSidesInfo> getAll() {
        return twoSidesInfoMapper.selectAll();
    }

    @Override
    public List<TwoSidesInfo> getData(TwoSidesInfo twoSidesInfo) {
        return twoSidesInfoMapper.select(twoSidesInfo);
    }

    @Override
    public TwoSidesInfo getOne(TwoSidesInfo twoSidesInfo) {
        return twoSidesInfoMapper.selectByPrimaryKey(twoSidesInfo);
    }

    @Override
    public Integer add(TwoSidesInfo twoSidesInfo) {
        return twoSidesInfoMapper.insert(twoSidesInfo);
    }

    @Override
    public Integer del(TwoSidesInfo twoSidesInfo) {
        return twoSidesInfoMapper.delete(twoSidesInfo);
    }

    @Override
    public Integer upd(TwoSidesInfo twoSidesInfo) {
        return twoSidesInfoMapper.updateByPrimaryKey(twoSidesInfo);
    }
}
