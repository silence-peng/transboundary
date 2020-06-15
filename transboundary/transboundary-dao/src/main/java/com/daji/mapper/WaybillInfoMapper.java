package com.daji.mapper;

import com.daji.pojo.WaybillInfo;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("waybillInfoMapper")
public interface WaybillInfoMapper extends tk.mybatis.mapper.common.Mapper<WaybillInfo> {
    List<WaybillInfo> getWaybill(WaybillInfo waybillInfo);
}
