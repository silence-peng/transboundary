package com.daji.mapper;

import com.daji.pojo.StatusAfter;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("statusAfterMapper")
public interface StatusAfterMapper extends tk.mybatis.mapper.common.Mapper<StatusAfter> {
}
