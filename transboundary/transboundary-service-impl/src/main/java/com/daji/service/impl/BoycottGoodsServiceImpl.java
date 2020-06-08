package com.daji.service.impl;

import com.daji.mapper.BoycottGoodsMapper;
import com.daji.pojo.BoycottGoods;
import com.daji.service.BoycottGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoycottGoodsServiceImpl implements BoycottGoodsService {
    @Autowired
    private BoycottGoodsMapper boycottGoodsMapper;

    @Override
    public List<BoycottGoods> getAll() {
        return boycottGoodsMapper.selectAll();
    }

    @Override
    public List<BoycottGoods> getData(BoycottGoods boycottGoods) {
        return boycottGoodsMapper.select(boycottGoods);
    }

    @Override
    public BoycottGoods getOne(BoycottGoods boycottGoods) {
        return boycottGoodsMapper.selectByPrimaryKey(boycottGoods);
    }

    @Override
    public Integer add(BoycottGoods boycottGoods) {
        return boycottGoodsMapper.insert(boycottGoods);
    }

    @Override
    public Integer del(BoycottGoods boycottGoods) {
        return boycottGoodsMapper.delete(boycottGoods);
    }

    @Override
    public Integer upd(BoycottGoods boycottGoods) {
        return boycottGoodsMapper.updateByPrimaryKey(boycottGoods);
    }
}
