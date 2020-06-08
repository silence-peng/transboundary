package com.daji.mapper;

import com.daji.pojo.FollowLogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("followLogInfoMapper")
public interface FollowLogInfoMapper extends tk.mybatis.mapper.common.Mapper<FollowLogInfo> {
}
