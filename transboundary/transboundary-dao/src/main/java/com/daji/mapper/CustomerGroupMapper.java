package com.daji.mapper;

import com.daji.pojo.CustomerGroup;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("customerGroupMapper")
public interface CustomerGroupMapper extends tk.mybatis.mapper.common.Mapper<CustomerGroup> {
}
