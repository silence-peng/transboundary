package com.daji.mapper;

import com.daji.pojo.OutboxInfo;
import org.springframework.stereotype.Repository;


@Repository("outboxInfoMapper")
public interface OutboxInfoMapper extends tk.mybatis.mapper.common.Mapper<OutboxInfo> {
}
