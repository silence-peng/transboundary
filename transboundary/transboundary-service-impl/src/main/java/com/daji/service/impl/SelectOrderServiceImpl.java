package com.daji.service.impl;

import com.daji.mapper.SelectOrderMapper;
import com.daji.pojo.SelectOrder;
import com.daji.pojo.SelectOrderPatementer;
import com.daji.service.SelectOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectOrderServiceImpl implements SelectOrderService {
    @Autowired
    private SelectOrderMapper selectOrderMapper;

    @Override
    public PageInfo<SelectOrder> selectAll(Integer pageNum, Integer pageSize, SelectOrderPatementer selectOrderPatementer) {
        PageHelper.startPage(pageNum,pageSize);
        List<SelectOrder> list = selectOrderMapper.selectAll(selectOrderPatementer);
        PageInfo<SelectOrder> page = new PageInfo<SelectOrder>(list);
        return page;
    }

    @Override
    public SelectOrder selectOne(SelectOrderPatementer selectOrderPatementer) {
        List<SelectOrder> list =  selectOrderMapper.selectAll(selectOrderPatementer);
        SelectOrder selectOrder =null;
        if(list.size()!=0){
            selectOrder = list.get(0);
        }
        return selectOrder;
    }
}
