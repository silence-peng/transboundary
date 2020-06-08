package com.daji.mapper;

import com.daji.pojo.WaybillNumber;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("waybillNumberMapper")
public interface WaybillNumberMapper extends tk.mybatis.mapper.common.Mapper<WaybillNumber> {
}
