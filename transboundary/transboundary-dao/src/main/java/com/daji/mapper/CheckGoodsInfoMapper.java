package com.daji.mapper;

import com.daji.pojo.CheckGoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("checkGoodsInfoMapper")
public interface CheckGoodsInfoMapper extends tk.mybatis.mapper.common.Mapper<CheckGoodsInfo> {
}
