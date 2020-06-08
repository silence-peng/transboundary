package com.daji.mapper;

import com.daji.pojo.BranchType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("branchTypeMapper")
public interface BranchTypeMapper extends tk.mybatis.mapper.common.Mapper<BranchType> {
}
