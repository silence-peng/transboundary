package com.daji.mapper;

import com.daji.pojo.Country;
import org.springframework.stereotype.Repository;


@Repository("countryMapper")
public interface CountryMapper extends tk.mybatis.mapper.common.Mapper<Country> {
}
