package com.daji.mapper;

import com.daji.pojo.MessageRecordInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("messageRecordInfoMapper")
public interface MessageRecordInfoMapper extends tk.mybatis.mapper.common.Mapper<MessageRecordInfo> {
}
