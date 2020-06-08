package com.daji.service.impl;

import com.daji.mapper.ProblemLoginInfoMapper;
import com.daji.pojo.ProblemLoginInfo;
import com.daji.service.ProblemLoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemLoginInfoServiceImpl implements ProblemLoginInfoService {
    @Autowired
    private ProblemLoginInfoMapper problemLoginInfoMapper;
    @Override
    public List<ProblemLoginInfo> getAll() {
        return problemLoginInfoMapper.selectAll();
    }

    @Override
    public List<ProblemLoginInfo> getData(ProblemLoginInfo problemLoginInfo) {
        return problemLoginInfoMapper.select(problemLoginInfo);
    }

    @Override
    public ProblemLoginInfo getOne(ProblemLoginInfo problemLoginInfo) {
        return problemLoginInfoMapper.selectOne(problemLoginInfo);
    }

    @Override
    public Integer add(ProblemLoginInfo problemLoginInfo) {
        return problemLoginInfoMapper.insert(problemLoginInfo);
    }

    @Override
    public Integer del(ProblemLoginInfo problemLoginInfo) {
        return problemLoginInfoMapper.delete(problemLoginInfo);
    }

    @Override
    public Integer upd(ProblemLoginInfo problemLoginInfo) {
        return problemLoginInfoMapper.updateByPrimaryKey(problemLoginInfo);
    }
}
