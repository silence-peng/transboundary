package com.daji.service.impl;

import com.daji.mapper.BejobMapper;
import com.daji.pojo.Bejob;
import com.daji.service.BejobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BejobServiceImpl implements BejobService {
    @Autowired
    private BejobMapper bejobMapper;

    @Override
    public List<Bejob> getAll() {
        return bejobMapper.selectAll();
    }

    @Override
    public List<Bejob> getData(Bejob bejob) {
        return bejobMapper.select(bejob);
    }

    @Override
    public Bejob getOne(Bejob bejob) {
        return bejobMapper.selectByPrimaryKey(bejob);
    }

    @Override
    public Integer add(Bejob bejob) {
        return bejobMapper.insert(bejob);
    }

    @Override
    public Integer del(Bejob bejob) {
        return bejobMapper.delete(bejob);
    }

    @Override
    public Integer upd(Bejob bejob) {
        return bejobMapper.updateByPrimaryKey(bejob);
    }
}
