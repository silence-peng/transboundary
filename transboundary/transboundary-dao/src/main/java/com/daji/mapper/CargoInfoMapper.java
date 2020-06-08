package com.daji.mapper;

import com.daji.pojo.CargoInfo;
import org.springframework.stereotype.Repository;


@Repository("cargoInfoMapper")
public interface CargoInfoMapper extends tk.mybatis.mapper.common.Mapper<CargoInfo> {
}
