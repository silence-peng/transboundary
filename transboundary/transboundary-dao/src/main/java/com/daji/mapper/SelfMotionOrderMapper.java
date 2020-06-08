package com.daji.mapper;

import com.daji.pojo.SelfMotionOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("selfMotionOrderMapper")
public interface SelfMotionOrderMapper extends tk.mybatis.mapper.common.Mapper<SelfMotionOrder> {
}
