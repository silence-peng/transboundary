package com.daji.mapper;

import com.daji.pojo.ClientType;
import org.springframework.stereotype.Repository;

@Repository("clientTypeMapper")
public interface ClientTypeMapper extends tk.mybatis.mapper.common.Mapper<ClientType> {
}
