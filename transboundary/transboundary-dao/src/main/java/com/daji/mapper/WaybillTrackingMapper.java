package com.daji.mapper;

import com.daji.pojo.WaybillTracking;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("waybillTrackingMapper")
public interface WaybillTrackingMapper extends tk.mybatis.mapper.common.Mapper<WaybillTracking> {
}
