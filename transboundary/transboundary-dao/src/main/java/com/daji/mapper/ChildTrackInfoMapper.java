package com.daji.mapper;

import com.daji.pojo.ChildTrackInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("childTrackInfoMapper")
public interface ChildTrackInfoMapper extends tk.mybatis.mapper.common.Mapper<ChildTrackInfo> {
}
