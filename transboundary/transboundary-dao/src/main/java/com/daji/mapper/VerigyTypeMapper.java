package com.daji.mapper;

import com.daji.pojo.VerifyType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("verigyTypeMapper")
public interface VerigyTypeMapper extends tk.mybatis.mapper.common.Mapper<VerifyType> {
}
