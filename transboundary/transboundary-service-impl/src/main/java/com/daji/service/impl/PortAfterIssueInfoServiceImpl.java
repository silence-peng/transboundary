package com.daji.service.impl;

import com.daji.mapper.PortAfterIssueInfoMapper;
import com.daji.pojo.PortAfterIssueInfo;
import com.daji.service.PortAfterIssueInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortAfterIssueInfoServiceImpl implements PortAfterIssueInfoService {
    @Autowired
    private PortAfterIssueInfoMapper portAfterIssueInfoMapper;
    @Override
    public List<PortAfterIssueInfo> getAll() {
        return portAfterIssueInfoMapper.selectAll();
    }

    @Override
    public List<PortAfterIssueInfo> getData(PortAfterIssueInfo portAfterIssueInfo) {
        return portAfterIssueInfoMapper.select(portAfterIssueInfo);
    }

    @Override
    public PortAfterIssueInfo getOne(PortAfterIssueInfo portAfterIssueInfo) {
        return portAfterIssueInfoMapper.selectOne(portAfterIssueInfo);
    }

    @Override
    public Integer add(PortAfterIssueInfo portAfterIssueInfo) {
        return portAfterIssueInfoMapper.insert(portAfterIssueInfo);
    }

    @Override
    public Integer del(PortAfterIssueInfo portAfterIssueInfo) {
        return portAfterIssueInfoMapper.delete(portAfterIssueInfo);
    }

    @Override
    public Integer upd(PortAfterIssueInfo portAfterIssueInfo) {
        return portAfterIssueInfoMapper.updateByPrimaryKey(portAfterIssueInfo);
    }
}
