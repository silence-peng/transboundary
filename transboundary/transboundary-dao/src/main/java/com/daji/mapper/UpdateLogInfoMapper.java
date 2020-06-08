package com.daji.mapper;

import com.daji.pojo.UpdateLogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("updateLogInfoMapper")
public interface UpdateLogInfoMapper extends tk.mybatis.mapper.common.Mapper<UpdateLogInfo> {
}
