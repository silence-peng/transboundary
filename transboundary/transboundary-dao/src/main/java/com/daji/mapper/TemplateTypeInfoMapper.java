package com.daji.mapper;

import com.daji.pojo.TemplateTypeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("templateTypeInfoMapper")
public interface TemplateTypeInfoMapper extends tk.mybatis.mapper.common.Mapper<TemplateTypeInfo> {
}
