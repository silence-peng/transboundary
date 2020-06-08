package com.daji.service.impl;

import com.daji.mapper.NumberVerificationMapper;
import com.daji.pojo.NumberVerification;
import com.daji.service.NumberVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberVerificationServiceImpl implements NumberVerificationService {
    @Autowired
    private NumberVerificationMapper numberVerificationMapper;
    @Override
    public List<NumberVerification> getAll() {
        return numberVerificationMapper.selectAll();
    }

    @Override
    public List<NumberVerification> getData(NumberVerification numberVerification) {
        return numberVerificationMapper.select(numberVerification);
    }

    @Override
    public NumberVerification getOne(NumberVerification numberVerification) {
        return numberVerificationMapper.selectByPrimaryKey(numberVerification);
    }

    @Override
    public Integer add(NumberVerification numberVerification) {
        return numberVerificationMapper.insert(numberVerification);
    }

    @Override
    public Integer del(NumberVerification numberVerification) {
        return numberVerificationMapper.delete(numberVerification);
    }

    @Override
    public Integer upd(NumberVerification numberVerification) {
        return numberVerificationMapper.updateByPrimaryKey(numberVerification);
    }
}
