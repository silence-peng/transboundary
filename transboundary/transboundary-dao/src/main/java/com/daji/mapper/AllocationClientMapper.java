package com.daji.mapper;

import com.daji.pojo.AllocationClient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("allocationClientMapper")
public interface AllocationClientMapper extends tk.mybatis.mapper.common.Mapper<AllocationClient> {
}
