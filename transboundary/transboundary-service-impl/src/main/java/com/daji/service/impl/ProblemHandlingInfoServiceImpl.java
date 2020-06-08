package com.daji.service.impl;

import com.daji.mapper.ProblemHandlingInfoMapper;
import com.daji.pojo.ProblemHandlingInfo;
import com.daji.service.ProblemHandlingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemHandlingInfoServiceImpl implements ProblemHandlingInfoService {
    @Autowired
    private ProblemHandlingInfoMapper problemHandlingInfoMapper;
    @Override
    public List<ProblemHandlingInfo> getAll() {
        return problemHandlingInfoMapper.selectAll();
    }

    @Override
    public List<ProblemHandlingInfo> getData(ProblemHandlingInfo problemHandlingInfo) {
        return problemHandlingInfoMapper.select(problemHandlingInfo);
    }

    @Override
    public ProblemHandlingInfo getOne(ProblemHandlingInfo problemHandlingInfo) {
        return problemHandlingInfoMapper.selectOne(problemHandlingInfo);
    }

    @Override
    public Integer add(ProblemHandlingInfo problemHandlingInfo) {
        return problemHandlingInfoMapper.insert(problemHandlingInfo);
    }

    @Override
    public Integer del(ProblemHandlingInfo problemHandlingInfo) {
        return problemHandlingInfoMapper.delete(problemHandlingInfo);
    }

    @Override
    public Integer upd(ProblemHandlingInfo problemHandlingInfo) {
        return problemHandlingInfoMapper.updateByPrimaryKey(problemHandlingInfo);
    }
}
