package com.daji.mapper;

import com.daji.pojo.CustomerServiceInfo;
import org.springframework.stereotype.Repository;

@Repository("customerServiceInfoMapper")
public interface CustomerServiceInfoMapper extends tk.mybatis.mapper.common.Mapper<CustomerServiceInfo> {
}
