package com.daji.mapper;

import com.daji.pojo.ProblemLoginInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("problemLoginInfoMapper")
public interface ProblemLoginInfoMapper extends tk.mybatis.mapper.common.Mapper<ProblemLoginInfo> {
}
