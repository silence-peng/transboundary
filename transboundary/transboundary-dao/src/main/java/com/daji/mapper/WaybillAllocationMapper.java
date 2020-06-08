package com.daji.mapper;

import com.daji.pojo.WaybillAllocation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("waybillAllocationMapper")
public interface WaybillAllocationMapper extends tk.mybatis.mapper.common.Mapper<WaybillAllocation> {
}
