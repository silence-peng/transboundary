package com.daji.mapper;

import com.daji.pojo.PlaySingleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("playSingleInfoMapper")
public interface PlaySingleInfoMapper extends tk.mybatis.mapper.common.Mapper<PlaySingleInfo> {

}
