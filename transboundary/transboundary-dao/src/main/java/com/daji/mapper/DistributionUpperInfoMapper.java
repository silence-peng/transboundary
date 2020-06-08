package com.daji.mapper;

import com.daji.pojo.DistributionUpperInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("distributionUpperInfoMapper")
public interface DistributionUpperInfoMapper extends tk.mybatis.mapper.common.Mapper<DistributionUpperInfo> {
}
