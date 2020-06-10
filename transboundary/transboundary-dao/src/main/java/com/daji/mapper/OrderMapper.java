package com.daji.mapper;

import com.daji.pojo.WaybillInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderMapper")
public interface OrderMapper {
    List<WaybillInfo> getWayBillInfo(WaybillInfo waybillInfo);
}
