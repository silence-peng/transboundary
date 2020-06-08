package com.daji.mapper;

import com.daji.pojo.WaybillType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("waybillTypeMapper")
public interface WaybillTypeMapper extends tk.mybatis.mapper.common.Mapper<WaybillType> {
}
