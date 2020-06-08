package com.daji.mapper;

import com.daji.pojo.GoodsShelvesInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("goodsShelvesInfoMapper")
public interface GoodsShelvesInfoMapper extends tk.mybatis.mapper.common.Mapper<GoodsShelvesInfo> {
}
