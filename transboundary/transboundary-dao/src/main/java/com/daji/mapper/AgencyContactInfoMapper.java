package com.daji.mapper;

import com.daji.pojo.AgencyContactInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("agencyContactInfoMapper")
public interface AgencyContactInfoMapper extends tk.mybatis.mapper.common.Mapper<AgencyContactInfo> {
}
