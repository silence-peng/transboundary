package com.daji.mapper;

import com.daji.pojo.JobRole;
import org.springframework.stereotype.Repository;


@Repository("jobRoleMapper")
public interface JobRoleMapper extends tk.mybatis.mapper.common.Mapper<JobRole> {
}
