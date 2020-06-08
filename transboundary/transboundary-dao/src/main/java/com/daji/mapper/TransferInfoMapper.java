package com.daji.mapper;

import com.daji.pojo.TransferInfo;
import org.springframework.stereotype.Repository;


@Repository("transferInfoMapper")
public interface TransferInfoMapper extends tk.mybatis.mapper.common.Mapper<TransferInfo> {
}
