package com.daji.mapper;

import com.daji.pojo.IssueStaus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("issueStausMapper")
public interface IssueStausMapper extends tk.mybatis.mapper.common.Mapper<IssueStaus> {
}
