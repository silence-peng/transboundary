package com.daji.mapper;

import com.daji.pojo.CargoPolicyInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("cargoPolicyInfoMapper")
public interface CargoPolicyInfoMapper extends tk.mybatis.mapper.common.Mapper<CargoPolicyInfo> {
}
