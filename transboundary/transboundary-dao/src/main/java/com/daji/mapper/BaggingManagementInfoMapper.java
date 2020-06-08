package com.daji.mapper;

import com.daji.pojo.BaggingManagementInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("baggingManagementInfoMapper")
public interface BaggingManagementInfoMapper extends tk.mybatis.mapper.common.Mapper<BaggingManagementInfo> {
}
