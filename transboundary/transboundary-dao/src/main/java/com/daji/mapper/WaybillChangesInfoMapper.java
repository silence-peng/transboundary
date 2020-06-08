package com.daji.mapper;

import com.daji.pojo.WaybillChangesInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("waybillChangesInfoMapper")
public interface WaybillChangesInfoMapper extends tk.mybatis.mapper.common.Mapper<WaybillChangesInfo> {
}
