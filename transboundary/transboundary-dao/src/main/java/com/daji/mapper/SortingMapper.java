package com.daji.mapper;

import com.daji.pojo.Sorting;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("sortingMapper")
public interface SortingMapper extends tk.mybatis.mapper.common.Mapper<Sorting> {
}
