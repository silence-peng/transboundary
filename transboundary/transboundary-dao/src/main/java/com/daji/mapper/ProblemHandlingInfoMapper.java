package com.daji.mapper;

import com.daji.pojo.ProblemHandlingInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("problemHandlingInfoMapper")
public interface ProblemHandlingInfoMapper extends tk.mybatis.mapper.common.Mapper<ProblemHandlingInfo> {
}
