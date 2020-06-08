package com.daji.mapper;

import com.daji.pojo.PositionLevel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("positionLevelMapper")
public interface PositionLevelMapper extends tk.mybatis.mapper.common.Mapper<PositionLevel> {
}
