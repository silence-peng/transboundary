package com.daji.service.impl;

import com.daji.mapper.BaggingMapper;
import com.daji.pojo.Bagging;
import com.daji.service.BaggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaggingServiceImpl implements BaggingService {
    @Autowired
    private BaggingMapper baggingMapper;

    @Override
    public List<Bagging> getAll() {
        return baggingMapper.selectAll();
    }

    @Override
    public List<Bagging> getData(Bagging bagging) {
        return baggingMapper.select(bagging);
    }

    @Override
    public Bagging getOne(Bagging bagging) {
        return baggingMapper.selectByPrimaryKey(bagging);
    }

    @Override
    public Integer add(Bagging bagging) {
        return baggingMapper.insert(bagging);
    }

    @Override
    public Integer del(Bagging bagging) {
        return baggingMapper.delete(bagging);
    }

    @Override
    public Integer upd(Bagging bagging) {
        return baggingMapper.updateByPrimaryKey(bagging);
    }
}
