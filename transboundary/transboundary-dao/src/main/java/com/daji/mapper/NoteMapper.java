package com.daji.mapper;

import com.daji.pojo.Note;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("noteMapper")
public interface NoteMapper extends tk.mybatis.mapper.common.Mapper<Note> {
}
