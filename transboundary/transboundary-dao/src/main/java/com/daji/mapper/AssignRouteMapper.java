package com.daji.mapper;

import com.daji.pojo.AssignRoute;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("assignRouteMapper")
public interface AssignRouteMapper extends tk.mybatis.mapper.common.Mapper<AssignRoute> {
}
