package com.daji.mapper;

import com.daji.pojo.BoycottGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("boycottGoodsInfoMapper")
public interface BoycottGoodsInfoMapper extends tk.mybatis.mapper.common.Mapper<BoycottGoodsInfo> {
}
