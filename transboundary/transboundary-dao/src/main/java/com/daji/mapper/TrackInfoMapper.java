package com.daji.mapper;

import com.daji.pojo.TrackInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("trackInfoMapper")
public interface TrackInfoMapper extends tk.mybatis.mapper.common.Mapper<TrackInfo> {
}
