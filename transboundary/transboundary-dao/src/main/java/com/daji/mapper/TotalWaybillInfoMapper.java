package com.daji.mapper;

import com.daji.pojo.TotalWaybillInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("totalWaybillInfoMapper")
public interface TotalWaybillInfoMapper extends tk.mybatis.mapper.common.Mapper<TotalWaybillInfo> {
}
