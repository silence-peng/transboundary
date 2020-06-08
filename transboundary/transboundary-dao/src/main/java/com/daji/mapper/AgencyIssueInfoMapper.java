package com.daji.mapper;

import com.daji.pojo.AgencyIssueInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("agencyIssueInfoMapper")
public interface AgencyIssueInfoMapper extends tk.mybatis.mapper.common.Mapper<AgencyIssueInfo> {
}
