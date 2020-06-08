package com.daji.mapper;

import com.daji.pojo.HandoverWaybillInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("handoverWaybillInfoMapper")
public interface HandoverWaybillInfoMapper extends tk.mybatis.mapper.common.Mapper<HandoverWaybillInfo> {
}
