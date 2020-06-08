package com.daji.service.impl;

import com.daji.mapper.PayInfoMapper;
import com.daji.pojo.PayInfo;
import com.daji.service.PayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayInfoServiceImpl implements PayInfoService {
    @Autowired
    private PayInfoMapper payInfoMapper;
    @Override
    public List<PayInfo> getAll() {
        return payInfoMapper.selectAll();
    }

    @Override
    public List<PayInfo> getData(PayInfo payInfo) {
        return payInfoMapper.select(payInfo);
    }

    @Override
    public PayInfo getOne(PayInfo payInfo) {
        return payInfoMapper.selectOne(payInfo);
    }

    @Override
    public Integer add(PayInfo payInfo) {
        return payInfoMapper.insert(payInfo);
    }

    @Override
    public Integer del(PayInfo payInfo) {
        return payInfoMapper.delete(payInfo);
    }

    @Override
    public Integer upd(PayInfo payInfo) {
        return payInfoMapper.updateByPrimaryKey(payInfo);
    }
}
