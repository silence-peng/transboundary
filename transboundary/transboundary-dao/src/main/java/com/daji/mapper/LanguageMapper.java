package com.daji.mapper;

import com.daji.pojo.Language;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("languageMapper")
public interface LanguageMapper extends tk.mybatis.mapper.common.Mapper<Language> {
}
