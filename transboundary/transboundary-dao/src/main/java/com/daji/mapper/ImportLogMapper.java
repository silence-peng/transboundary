package com.daji.mapper;

import com.daji.pojo.ImportLog;
import org.springframework.stereotype.Repository;


@Repository("importLogMapper")
public interface ImportLogMapper extends tk.mybatis.mapper.common.Mapper<ImportLog> {
}
