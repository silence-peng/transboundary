package com.daji.mapper;

import com.daji.pojo.EnglishDescriptionType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("englishDescriptionTypeMapper")
public interface EnglishDescriptionTypeMapper extends tk.mybatis.mapper.common.Mapper<EnglishDescriptionType> {
}
