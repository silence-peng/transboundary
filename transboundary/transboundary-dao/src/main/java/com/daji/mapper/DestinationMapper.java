package com.daji.mapper;

import com.daji.pojo.Destination;
import org.springframework.stereotype.Repository;


@Repository("destinationMapper")
public interface DestinationMapper extends tk.mybatis.mapper.common.Mapper<Destination> {
}
