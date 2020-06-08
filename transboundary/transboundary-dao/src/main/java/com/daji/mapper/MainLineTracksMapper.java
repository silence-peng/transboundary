package com.daji.mapper;

import com.daji.pojo.MainLineTracks;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("mainLineTracksMapper")
public interface MainLineTracksMapper extends tk.mybatis.mapper.common.Mapper<MainLineTracks> {
}
