package com.daji.service.impl;

import com.daji.mapper.PaymentMethodInfoMapper;
import com.daji.pojo.PaymentMethodInfo;
import com.daji.service.PaymentMethodInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PaymentMethodInfoServiceImpl implements PaymentMethodInfoService {
    @Autowired
    private PaymentMethodInfoMapper paymentMethodInfoMapper;
    @Override
    public List<PaymentMethodInfo> getAll() {
        return paymentMethodInfoMapper.selectAll();
    }

    @Override
    public List<PaymentMethodInfo> getData(PaymentMethodInfo paymentMethodInfo) {
        return paymentMethodInfoMapper.select(paymentMethodInfo);
    }

    @Override
    public PaymentMethodInfo getOne(PaymentMethodInfo paymentMethodInfo) {
        return paymentMethodInfoMapper.selectOne(paymentMethodInfo);
    }

    @Override
    public Integer add(PaymentMethodInfo paymentMethodInfo) {
        return paymentMethodInfoMapper.insert(paymentMethodInfo);
    }

    @Override
    public Integer del(PaymentMethodInfo paymentMethodInfo) {
        return paymentMethodInfoMapper.delete(paymentMethodInfo);
    }

    @Override
    public Integer upd(PaymentMethodInfo paymentMethodInfo) {
        return paymentMethodInfoMapper.updateByPrimaryKey(paymentMethodInfo);
    }
}
