package com.daji.mapper;

import com.daji.pojo.Bejob;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("bejobMapper")
public interface BejobMapper extends tk.mybatis.mapper.common.Mapper<Bejob> {
}
