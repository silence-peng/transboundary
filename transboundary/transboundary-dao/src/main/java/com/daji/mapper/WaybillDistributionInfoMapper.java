package com.daji.mapper;

import com.daji.pojo.WaybillDistributionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("waybillDistributionInfoMapper")
public interface WaybillDistributionInfoMapper extends tk.mybatis.mapper.common.Mapper<WaybillDistributionInfo> {
}
