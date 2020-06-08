package com.daji.mapper;

import com.daji.pojo.PrintRecordInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("printRecordInfoMapper")
public interface PrintRecordInfoMapper extends tk.mybatis.mapper.common.Mapper<PrintRecordInfo> {
}
