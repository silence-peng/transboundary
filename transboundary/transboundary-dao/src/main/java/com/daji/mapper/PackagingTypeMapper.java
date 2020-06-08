package com.daji.mapper;

import com.daji.pojo.PackagingType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("packagingTypeMapper")
public interface PackagingTypeMapper extends tk.mybatis.mapper.common.Mapper<PackagingType> {
}
