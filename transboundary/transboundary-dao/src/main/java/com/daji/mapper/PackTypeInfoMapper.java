package com.daji.mapper;

import com.daji.pojo.PackTypeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("packTypeInfoMapper")
public interface PackTypeInfoMapper extends tk.mybatis.mapper.common.Mapper<PackTypeInfo> {
}
