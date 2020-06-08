package com.daji.service.impl;

import com.daji.mapper.JobRoleMapper;
import com.daji.pojo.JobRole;
import com.daji.service.JobRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobRoleServiceImpl implements JobRoleService {
    @Autowired
    private JobRoleMapper jobRoleMapper;
    @Override
    public List<JobRole> getAll() {
        return jobRoleMapper.selectAll();
    }

    @Override
    public List<JobRole> getData(JobRole jobRole) {
        return jobRoleMapper.select(jobRole);
    }

    @Override
    public JobRole getOne(JobRole jobRole) {
        return jobRoleMapper.selectByPrimaryKey(jobRole);
    }

    @Override
    public Integer add(JobRole jobRole) {
        return jobRoleMapper.insert(jobRole);
    }

    @Override
    public Integer del(JobRole jobRole) {
        return jobRoleMapper.delete(jobRole);
    }

    @Override
    public Integer upd(JobRole jobRole) {
        return jobRoleMapper.updateByPrimaryKey(jobRole);
    }
}
