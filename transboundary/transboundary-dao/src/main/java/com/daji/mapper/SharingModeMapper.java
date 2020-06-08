package com.daji.mapper;

import com.daji.pojo.SharingMode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("sharingModeMapper")
public interface SharingModeMapper extends tk.mybatis.mapper.common.Mapper<SharingMode> {
}
