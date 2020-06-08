package com.daji.mapper;

import com.daji.pojo.BusinessType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("businessTypeMapper")
public interface BusinessTypeMapper extends tk.mybatis.mapper.common.Mapper<BusinessType> {
}
