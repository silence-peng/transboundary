package com.daji.mapper;

import com.daji.pojo.ChildOrdersInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("childOrdersInfo")
public interface ChildOrdersInfoMapper extends tk.mybatis.mapper.common.Mapper<ChildOrdersInfo> {
}
