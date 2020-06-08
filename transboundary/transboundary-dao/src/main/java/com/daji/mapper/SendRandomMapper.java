package com.daji.mapper;

import com.daji.pojo.SendRandom;
import org.springframework.stereotype.Repository;


@Repository("sendRandomMapper")
public interface SendRandomMapper extends tk.mybatis.mapper.common.Mapper<SendRandom> {
}
