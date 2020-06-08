package com.daji.service.impl;

import com.daji.mapper.OrderStateInfoMapper;
import com.daji.pojo.OrderStateInfo;
import com.daji.service.OrderStateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderStateInfoServiceImpl implements OrderStateInfoService {
    @Autowired
    private OrderStateInfoMapper orderStateInfoMapper;
    @Override
    public List<OrderStateInfo> getAll() {
        return orderStateInfoMapper.selectAll();
    }

    @Override
    public List<OrderStateInfo> getData(OrderStateInfo orderStateInfo) {
        return orderStateInfoMapper.select(orderStateInfo);
    }

    @Override
    public OrderStateInfo getOne(OrderStateInfo orderStateInfo) {
        return orderStateInfoMapper.selectByPrimaryKey(orderStateInfo);
    }

    @Override
    public Integer add(OrderStateInfo orderStateInfo) {
        return orderStateInfoMapper.insert(orderStateInfo);
    }

    @Override
    public Integer del(OrderStateInfo orderStateInfo) {
        return orderStateInfoMapper.delete(orderStateInfo);
    }

    @Override
    public Integer upd(OrderStateInfo orderStateInfo) {
        return orderStateInfoMapper.updateByPrimaryKey(orderStateInfo);
    }
}
