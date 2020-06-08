package com.daji.service.impl;

import com.daji.mapper.GoodsShelvesInfoMapper;
import com.daji.pojo.GoodsShelvesInfo;
import com.daji.service.GoodsShelvesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsShelvesInfoServiceImpl implements GoodsShelvesInfoService {
    @Autowired
    private GoodsShelvesInfoMapper goodsShelvesInfoMapper;
    @Override
    public List<GoodsShelvesInfo> getAll() {
        return goodsShelvesInfoMapper.selectAll();
    }

    @Override
    public List<GoodsShelvesInfo> getData(GoodsShelvesInfo goodsShelvesInfo) {
        return goodsShelvesInfoMapper.select(goodsShelvesInfo);
    }

    @Override
    public GoodsShelvesInfo getOne(GoodsShelvesInfo goodsShelvesInfo) {
        return goodsShelvesInfoMapper.selectByPrimaryKey(goodsShelvesInfo);
    }

    @Override
    public Integer add(GoodsShelvesInfo goodsShelvesInfo) {
        return goodsShelvesInfoMapper.insert(goodsShelvesInfo);
    }

    @Override
    public Integer del(GoodsShelvesInfo goodsShelvesInfo) {
        return goodsShelvesInfoMapper.delete(goodsShelvesInfo);
    }

    @Override
    public Integer upd(GoodsShelvesInfo goodsShelvesInfo) {
        return goodsShelvesInfoMapper.updateByPrimaryKey(goodsShelvesInfo);
    }
}
