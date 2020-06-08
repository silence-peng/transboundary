package com.daji.mapper;

import com.daji.pojo.DestinationType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("destinationTypeMapper")
public interface DestinationTypeMapper extends tk.mybatis.mapper.common.Mapper<DestinationType> {
}
