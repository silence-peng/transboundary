package com.daji.mapper;

import com.daji.pojo.EnglishDescription;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("englishDescriptionMapper")
public interface EnglishDescriptionMapper extends tk.mybatis.mapper.common.Mapper<EnglishDescription> {
}
