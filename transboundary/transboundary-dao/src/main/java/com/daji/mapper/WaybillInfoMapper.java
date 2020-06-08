package com.daji.mapper;

import com.daji.pojo.WaybillInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("waybillInfoMapper")
public interface WaybillInfoMapper extends tk.mybatis.mapper.common.Mapper<WaybillInfo> {
}
