package com.daji.mapper;

import com.daji.pojo.AgencyBasicInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("agencyBasicInfoMapper")
public interface AgencyBasicInfoMapper extends tk.mybatis.mapper.common.Mapper<AgencyBasicInfo> {
}
