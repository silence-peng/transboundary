package com.daji.mapper;

import com.daji.pojo.TransportInfo;
import org.springframework.stereotype.Repository;


@Repository("transportInfoMapper")
public interface TransportInfoMapper extends tk.mybatis.mapper.common.Mapper<TransportInfo> {
}
