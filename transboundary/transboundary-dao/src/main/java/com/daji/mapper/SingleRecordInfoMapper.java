package com.daji.mapper;

import com.daji.pojo.SingleRecordInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("singleRecordInfoMapper")
public interface SingleRecordInfoMapper extends tk.mybatis.mapper.common.Mapper<SingleRecordInfo> {
}
