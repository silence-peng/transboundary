package com.daji.service.impl;

import com.daji.mapper.SelfMotionOrderMapper;
import com.daji.pojo.SelfMotionOrder;
import com.daji.service.SelfMotionOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SelfMotionOrderServiceImpl implements SelfMotionOrderService {
    @Autowired
    private SelfMotionOrderMapper selfMotionOrderMapper;
    @Override
    public List<SelfMotionOrder> getAll() {
        return selfMotionOrderMapper.selectAll();
    }

    @Override
    public List<SelfMotionOrder> getData(SelfMotionOrder selfMotionOrder) {
        return selfMotionOrderMapper.select(selfMotionOrder);
    }

    @Override
    public SelfMotionOrder getOne(SelfMotionOrder selfMotionOrder) {
        return selfMotionOrderMapper.selectOne(selfMotionOrder);
    }

    @Override
    public Integer add(SelfMotionOrder selfMotionOrder) {
        return selfMotionOrderMapper.insert(selfMotionOrder);
    }

    @Override
    public Integer del(SelfMotionOrder selfMotionOrder) {
        return selfMotionOrderMapper.delete(selfMotionOrder);
    }

    @Override
    public Integer upd(SelfMotionOrder selfMotionOrder) {
        return selfMotionOrderMapper.updateByPrimaryKey(selfMotionOrder);
    }
}
