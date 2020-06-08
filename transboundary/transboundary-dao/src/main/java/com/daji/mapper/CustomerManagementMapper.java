package com.daji.mapper;

import com.daji.pojo.CustomerManagement;
import org.springframework.stereotype.Repository;

@Repository("customerManagementMapper")
public interface CustomerManagementMapper extends tk.mybatis.mapper.common.Mapper<CustomerManagement> {
}
