package com.daji.mapper;

import com.daji.pojo.Bagging;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("baggingMapper")
public interface BaggingMapper extends tk.mybatis.mapper.common.Mapper<Bagging> {
}
