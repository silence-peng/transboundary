package com.daji.service.impl;

import com.daji.mapper.ConractMapper;
import com.daji.pojo.Conract;
import com.daji.service.ConractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConractServiceImpl implements ConractService {
    @Autowired
    private ConractMapper conractMapper;

    @Override
    public List<Conract> getAll() {
        return conractMapper.selectAll();
    }

    @Override
    public List<Conract> getData(Conract conract) {
        return conractMapper.select(conract);
    }

    @Override
    public Conract getOne(Conract conract) {
        return conractMapper.selectByPrimaryKey(conract);
    }

    @Override
    public Integer add(Conract conract) {
        return conractMapper.insert(conract);
    }

    @Override
    public Integer del(Conract conract) {
        return conractMapper.delete(conract);
    }

    @Override
    public Integer upd(Conract conract) {
        return conractMapper.updateByPrimaryKey(conract);
    }
}
