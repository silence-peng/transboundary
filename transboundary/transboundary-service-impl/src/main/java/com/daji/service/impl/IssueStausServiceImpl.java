package com.daji.service.impl;

import com.daji.mapper.IssueStausMapper;
import com.daji.pojo.IssueStaus;
import com.daji.service.IssueStausService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueStausServiceImpl implements IssueStausService {
    @Autowired
    private IssueStausMapper issueStausMapper;
    @Override
    public List<IssueStaus> getAll() {
        return issueStausMapper.selectAll();
    }

    @Override
    public List<IssueStaus> getData(IssueStaus issueStaus) {
        return issueStausMapper.select(issueStaus);
    }

    @Override
    public IssueStaus getOne(IssueStaus issueStaus) {
        return issueStausMapper.selectByPrimaryKey(issueStaus);
    }

    @Override
    public Integer add(IssueStaus issueStaus) {
        return issueStausMapper.insert(issueStaus);
    }

    @Override
    public Integer del(IssueStaus issueStaus) {
        return issueStausMapper.delete(issueStaus);
    }

    @Override
    public Integer upd(IssueStaus issueStaus) {
        return issueStausMapper.updateByPrimaryKey(issueStaus);
    }
}
