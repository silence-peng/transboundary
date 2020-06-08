package com.daji.mapper;

import com.daji.pojo.DestinationManagement;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("destinationManagementMapper")
public interface DestinationManagementMapper extends tk.mybatis.mapper.common.Mapper<DestinationManagement> {
}
