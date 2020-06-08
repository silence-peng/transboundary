package com.daji.mapper;

import com.daji.pojo.PayInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("payInfoMapper")
public interface PayInfoMapper extends tk.mybatis.mapper.common.Mapper<PayInfo> {
}
