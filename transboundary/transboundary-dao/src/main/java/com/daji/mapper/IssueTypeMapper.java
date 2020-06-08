package com.daji.mapper;

import com.daji.pojo.IssueType;
import org.springframework.stereotype.Repository;


@Repository("issueTypeMapper")
public interface IssueTypeMapper extends tk.mybatis.mapper.common.Mapper<IssueType> {
}
