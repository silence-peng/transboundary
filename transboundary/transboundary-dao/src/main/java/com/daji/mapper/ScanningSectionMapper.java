package com.daji.mapper;

import com.daji.pojo.ScanningSection;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("scanningSectionMapper")
public interface ScanningSectionMapper extends tk.mybatis.mapper.common.Mapper<ScanningSection> {
}
