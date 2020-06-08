package com.daji.mapper;

import com.daji.pojo.TwoSidesInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("twoSidesInfoMapper")
public interface TwoSidesInfoMapper extends tk.mybatis.mapper.common.Mapper<TwoSidesInfo> {
}
