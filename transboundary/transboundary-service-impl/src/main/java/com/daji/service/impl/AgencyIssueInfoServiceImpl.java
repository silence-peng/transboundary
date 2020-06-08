package com.daji.service.impl;

import com.daji.mapper.AgencyIssueInfoMapper;
import com.daji.pojo.AgencyIssueInfo;
import com.daji.service.AgencyIssueInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyIssueInfoServiceImpl implements AgencyIssueInfoService {
    @Autowired
    private AgencyIssueInfoMapper agencyIssueInfoMapper;
    @Override
    public List<AgencyIssueInfo> getAll() {
        return agencyIssueInfoMapper.selectAll();
    }

    @Override
    public List<AgencyIssueInfo> getData(AgencyIssueInfo agencyIssueInfo) {
        return agencyIssueInfoMapper.select(agencyIssueInfo);
    }

    @Override
    public AgencyIssueInfo getOne(AgencyIssueInfo agencyIssueInfo) {
        return agencyIssueInfoMapper.selectOne(agencyIssueInfo);
    }

    @Override
    public Integer add(AgencyIssueInfo agencyIssueInfo) {
        return agencyIssueInfoMapper.insert(agencyIssueInfo);
    }

    @Override
    public Integer del(AgencyIssueInfo agencyIssueInfo) {
        return agencyIssueInfoMapper.delete(agencyIssueInfo);
    }

    @Override
    public Integer upd(AgencyIssueInfo agencyIssueInfo) {
        return agencyIssueInfoMapper.updateByPrimaryKey(agencyIssueInfo);
    }
}
