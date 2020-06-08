package com.daji.mapper;

import com.daji.pojo.WaybillAttachmentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("waybillAttachmentInfoMapper")
public interface WaybillAttachmentInfoMapper extends tk.mybatis.mapper.common.Mapper<WaybillAttachmentInfo> {
}
