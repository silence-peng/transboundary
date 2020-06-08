package com.daji.mapper;

import com.daji.pojo.NoteVariate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Repository("noteVariateMapper")
public interface NoteVariateMapper extends tk.mybatis.mapper.common.Mapper<NoteVariate> {
}
