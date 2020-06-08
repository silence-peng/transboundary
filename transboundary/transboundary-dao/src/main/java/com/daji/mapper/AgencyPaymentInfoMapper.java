package com.daji.mapper;

import com.daji.pojo.AgencyPaymentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("agencyPaymentInfoMapper")
public interface AgencyPaymentInfoMapper extends tk.mybatis.mapper.common.Mapper<AgencyPaymentInfo> {
}
