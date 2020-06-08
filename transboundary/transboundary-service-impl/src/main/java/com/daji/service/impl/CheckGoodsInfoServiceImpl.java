package com.daji.service.impl;

import com.daji.mapper.CheckGoodsInfoMapper;
import com.daji.pojo.CheckGoodsInfo;
import com.daji.service.CheckGoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckGoodsInfoServiceImpl implements CheckGoodsInfoService {
    @Autowired
    private CheckGoodsInfoMapper checkGoodsInfoMapper;
    @Override
    public List<CheckGoodsInfo> getAll() {
        return checkGoodsInfoMapper.selectAll();
    }

    @Override
    public List<CheckGoodsInfo> getData(CheckGoodsInfo checkGoodsInfo) {
        return checkGoodsInfoMapper.select(checkGoodsInfo);
    }

    @Override
    public CheckGoodsInfo getOne(CheckGoodsInfo checkGoodsInfo) {
        return checkGoodsInfoMapper.selectByPrimaryKey(checkGoodsInfo);
    }

    @Override
    public Integer add(CheckGoodsInfo checkGoodsInfo) {
        return checkGoodsInfoMapper.insert(checkGoodsInfo);
    }

    @Override
    public Integer del(CheckGoodsInfo checkGoodsInfo) {
        return checkGoodsInfoMapper.delete(checkGoodsInfo);
    }

    @Override
    public Integer upd(CheckGoodsInfo checkGoodsInfo) {
        return checkGoodsInfoMapper.updateByPrimaryKey(checkGoodsInfo);
    }
}
