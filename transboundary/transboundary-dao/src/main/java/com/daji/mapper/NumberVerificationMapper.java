package com.daji.mapper;

import com.daji.pojo.NumberVerification;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("numberVerificationMapper")
public interface NumberVerificationMapper extends tk.mybatis.mapper.common.Mapper<NumberVerification> {
}
