package com.daji.mapper;

import com.daji.pojo.Outbox;
import org.springframework.stereotype.Repository;


@Repository("outboxMapper")
public interface OutboxMapper extends tk.mybatis.mapper.common.Mapper<Outbox> {
}
