package com.daji.mapper;

import com.daji.pojo.TemplateLogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("templateLogInfoMapper")
public interface TemplateLogInfoMapper extends tk.mybatis.mapper.common.Mapper<TemplateLogInfo> {
}
