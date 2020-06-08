package com.daji.service.impl;

import com.daji.mapper.PortBeforeIssueInfoMapper;
import com.daji.pojo.PortBeforeIssueInfo;
import com.daji.service.PortBeforeIssueInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortBeforeIssueInfoServiceImpl implements PortBeforeIssueInfoService {
    @Autowired
    private PortBeforeIssueInfoMapper portBeforeIssueInfoMapper;
    @Override
    public List<PortBeforeIssueInfo> getAll() {
        return portBeforeIssueInfoMapper.selectAll();
    }

    @Override
    public List<PortBeforeIssueInfo> getData(PortBeforeIssueInfo portBeforeIssueInfo) {
        return portBeforeIssueInfoMapper.select(portBeforeIssueInfo);
    }

    @Override
    public PortBeforeIssueInfo getOne(PortBeforeIssueInfo portBeforeIssueInfo) {
        return portBeforeIssueInfoMapper.selectOne(portBeforeIssueInfo);
    }

    @Override
    public Integer add(PortBeforeIssueInfo portBeforeIssueInfo) {
        return portBeforeIssueInfoMapper.insert(portBeforeIssueInfo);
    }

    @Override
    public Integer del(PortBeforeIssueInfo portBeforeIssueInfo) {
        return portBeforeIssueInfoMapper.delete(portBeforeIssueInfo);
    }

    @Override
    public Integer upd(PortBeforeIssueInfo portBeforeIssueInfo) {
        return portBeforeIssueInfoMapper.updateByPrimaryKey(portBeforeIssueInfo);
    }
}
