package com.daji.mapper;

import com.daji.pojo.NoteType;
import org.springframework.stereotype.Repository;


@Repository("noteTypeMapper")
public interface NoteTypeMapper extends tk.mybatis.mapper.common.Mapper<NoteType> {
}
