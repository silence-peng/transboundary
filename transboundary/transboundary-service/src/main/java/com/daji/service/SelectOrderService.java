package com.daji.service;

import com.daji.pojo.SelectOrder;
import com.daji.pojo.SelectOrderPatementer;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SelectOrderService {
    PageInfo<SelectOrder> selectAll(Integer pageNum, Integer pageSize, SelectOrderPatementer selectOrderPatementer);
    SelectOrder selectOne(SelectOrderPatementer selectOrderPatementer);
}
