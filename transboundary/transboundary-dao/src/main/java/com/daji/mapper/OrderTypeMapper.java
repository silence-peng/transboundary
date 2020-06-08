package com.daji.mapper;

import com.daji.pojo.OrderType;
import org.springframework.stereotype.Repository;


@Repository("orderTypeMapper")
public interface OrderTypeMapper extends tk.mybatis.mapper.common.Mapper<OrderType> {
}
