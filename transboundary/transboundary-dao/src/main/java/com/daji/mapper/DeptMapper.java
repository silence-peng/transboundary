package com.daji.mapper;

import com.daji.pojo.Dept;
import org.springframework.stereotype.Repository;


@Repository("deptMapper")
public interface DeptMapper extends tk.mybatis.mapper.common.Mapper<Dept> {
}
