package com.daji.mapper;

import com.daji.pojo.ProductInStorageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("productInStorageInfoMapper")
public interface ProductInStorageInfoMapper extends tk.mybatis.mapper.common.Mapper<ProductInStorageInfo> {
}
