package com.daji.service.impl;

import com.daji.mapper.IssueTypeMapper;
import com.daji.pojo.IssueType;
import com.daji.service.IssueTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueTypeServiceImpl implements IssueTypeService {
    @Autowired
    private IssueTypeMapper issueTypeMapper;
    @Override
    public List<IssueType> getAll() {
        return issueTypeMapper.selectAll();
    }

    @Override
    public List<IssueType> getData(IssueType issueType) {
        return issueTypeMapper.select(issueType);
    }

    @Override
    public IssueType getOne(IssueType issueType) {
        return issueTypeMapper.selectByPrimaryKey(issueType);
    }

    @Override
    public Integer add(IssueType issueType) {
        return issueTypeMapper.insert(issueType);
    }

    @Override
    public Integer del(IssueType issueType) {
        return issueTypeMapper.delete(issueType);
    }

    @Override
    public Integer upd(IssueType issueType) {
        return issueTypeMapper.updateByPrimaryKey(issueType);
    }
}
