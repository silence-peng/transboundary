package com.daji.mapper;

import com.daji.pojo.AgencyType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("agencyTypeMapper")
public interface AgencyTypeMapper extends tk.mybatis.mapper.common.Mapper<AgencyType> {
}
