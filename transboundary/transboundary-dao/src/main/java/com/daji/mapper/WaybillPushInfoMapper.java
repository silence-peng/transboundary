package com.daji.mapper;

import com.daji.pojo.WaybillPushInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("waybillPushInfoMapper")
public interface WaybillPushInfoMapper extends tk.mybatis.mapper.common.Mapper<WaybillPushInfo> {
}
