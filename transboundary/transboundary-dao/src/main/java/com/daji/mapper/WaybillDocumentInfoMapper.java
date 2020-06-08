package com.daji.mapper;

import com.daji.pojo.WaybillDocumentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("waybillDocumentInfoMapper")
public interface WaybillDocumentInfoMapper extends tk.mybatis.mapper.common.Mapper<WaybillDocumentInfo> {
}
