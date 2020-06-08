package com.daji.mapper;

import com.daji.pojo.BoycottGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("boycottGoodsMapper")
public interface BoycottGoodsMapper extends tk.mybatis.mapper.common.Mapper<BoycottGoods> {
}
