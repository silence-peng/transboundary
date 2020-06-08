package com.daji.mapper;

import com.daji.pojo.ProductCustomerInfo;
import org.springframework.stereotype.Repository;


@Repository("productCustomerInfoMapper")
public interface ProductCustomerInfoMapper extends tk.mybatis.mapper.common.Mapper<ProductCustomerInfo> {
}
