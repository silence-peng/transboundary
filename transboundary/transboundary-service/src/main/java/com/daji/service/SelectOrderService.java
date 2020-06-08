package com.daji.service;

import com.daji.pojo.SelectOrder;
import com.github.pagehelper.PageInfo;

public interface SelectOrderService {
    PageInfo<SelectOrder> selectAll(Integer pageNum, Integer pageSize);
}
