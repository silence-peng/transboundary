package com.daji.mapper;

import com.daji.pojo.UpperManagementInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("upperManagementInfoMapper")
public interface UpperManagementInfoMapper extends tk.mybatis.mapper.common.Mapper<UpperManagementInfo> {
}
