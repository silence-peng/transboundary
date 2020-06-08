package com.daji.mapper;

import com.daji.pojo.ClearWarehouseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("clearWarehouseInfoMapper")
public interface ClearWarehouseInfoMapper extends tk.mybatis.mapper.common.Mapper<ClearWarehouseInfo> {
}
