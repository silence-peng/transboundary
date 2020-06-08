package com.daji.mapper;

import com.daji.pojo.BranchBasicsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("branchBasicsInfoMapper")
public interface BranchBasicsInfoMapper extends tk.mybatis.mapper.common.Mapper<BranchBasicsInfo> {
}
