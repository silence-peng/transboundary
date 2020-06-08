package com.daji.mapper;

import com.daji.pojo.Sender;
import org.springframework.stereotype.Repository;


@Repository("senderMapper")
public interface SenderMapper extends tk.mybatis.mapper.common.Mapper<Sender> {
}
