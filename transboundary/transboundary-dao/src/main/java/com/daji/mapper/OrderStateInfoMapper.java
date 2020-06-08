package com.daji.mapper;

import com.daji.pojo.OrderStateInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("orderStateInfoMapper")
public interface OrderStateInfoMapper extends tk.mybatis.mapper.common.Mapper<OrderStateInfo> {
}
