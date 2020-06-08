package com.daji.mapper;

import com.daji.pojo.ImportTemplateInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("importTemplateInfoMapper")
public interface ImportTemplateInfoMapper extends tk.mybatis.mapper.common.Mapper<ImportTemplateInfo> {
}
