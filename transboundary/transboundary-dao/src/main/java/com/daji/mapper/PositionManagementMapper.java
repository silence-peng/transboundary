package com.daji.mapper;

import com.daji.pojo.PositionManagement;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("positionManagementMapper")
public interface PositionManagementMapper extends tk.mybatis.mapper.common.Mapper<PositionManagement> {
}
