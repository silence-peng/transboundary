package com.daji.mapper;

import com.daji.pojo.BaggingDistributionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("baggingDistributionInfoMapper")
public interface BaggingDistributionInfoMapper extends tk.mybatis.mapper.common.Mapper<BaggingDistributionInfo> {
}
