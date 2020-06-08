package com.daji.mapper;

import com.daji.pojo.CustomerContactPerson;
import org.springframework.stereotype.Repository;

@Repository("customerContactPersonMapper")
public interface CustomerContactPersonMapper extends tk.mybatis.mapper.common.Mapper<CustomerContactPerson> {
}
