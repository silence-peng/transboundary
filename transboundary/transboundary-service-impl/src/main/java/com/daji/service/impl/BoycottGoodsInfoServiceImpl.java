package com.daji.service.impl;

import com.daji.mapper.BoycottGoodsInfoMapper;
import com.daji.pojo.BoycottGoodsInfo;
import com.daji.service.BoycottGoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoycottGoodsInfoServiceImpl implements BoycottGoodsInfoService {
    @Autowired
    private BoycottGoodsInfoMapper boycottGoodsInfoMapper;
    @Override
    public List<BoycottGoodsInfo> getAll() {
        return boycottGoodsInfoMapper.selectAll();
    }

    @Override
    public List<BoycottGoodsInfo> getData(BoycottGoodsInfo boycottGoodsInfo) {
        return boycottGoodsInfoMapper.select(boycottGoodsInfo);
    }

    @Override
    public BoycottGoodsInfo getOne(BoycottGoodsInfo boycottGoodsInfo) {
        return boycottGoodsInfoMapper.selectByPrimaryKey(boycottGoodsInfo);
    }

    @Override
    public Integer add(BoycottGoodsInfo boycottGoodsInfo) {
        return boycottGoodsInfoMapper.insert(boycottGoodsInfo);
    }

    @Override
    public Integer del(BoycottGoodsInfo boycottGoodsInfo) {
        return boycottGoodsInfoMapper.delete(boycottGoodsInfo);
    }

    @Override
    public Integer upd(BoycottGoodsInfo boycottGoodsInfo) {
        return boycottGoodsInfoMapper.updateByPrimaryKey(boycottGoodsInfo);
    }
}
