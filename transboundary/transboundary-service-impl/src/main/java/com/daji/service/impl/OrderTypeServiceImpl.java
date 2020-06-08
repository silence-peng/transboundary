package com.daji.service.impl;

import com.daji.mapper.OrderTypeMapper;
import com.daji.pojo.OrderType;
import com.daji.service.OrderTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderTypeServiceImpl implements OrderTypeService {
    @Autowired
    private OrderTypeMapper orderTypeMapper;
    @Override
    public List<OrderType> getAll() {
        return orderTypeMapper.selectAll();
    }

    @Override
    public List<OrderType> getData(OrderType orderType) {
        return orderTypeMapper.select(orderType);
    }

    @Override
    public OrderType getOne(OrderType orderType) {
        return orderTypeMapper.selectByPrimaryKey(orderType);
    }

    @Override
    public Integer add(OrderType orderType) {
        return orderTypeMapper.insert(orderType);
    }

    @Override
    public Integer del(OrderType orderType) {
        return orderTypeMapper.delete(orderType);
    }

    @Override
    public Integer upd(OrderType orderType) {
        return orderTypeMapper.updateByPrimaryKey(orderType);
    }
}
