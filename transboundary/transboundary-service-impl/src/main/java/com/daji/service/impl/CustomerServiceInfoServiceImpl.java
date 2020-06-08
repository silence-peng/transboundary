package com.daji.service.impl;

import com.daji.mapper.CustomerServiceInfoMapper;
import com.daji.pojo.CustomerServiceInfo;
import com.daji.service.CustomerServiceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceInfoServiceImpl implements CustomerServiceInfoService {
    @Autowired
    private CustomerServiceInfoMapper customerServiceInfoMapper;
    @Override
    public List<CustomerServiceInfo> getAll() {
        return customerServiceInfoMapper.selectAll();
    }

    @Override
    public List<CustomerServiceInfo> getData(CustomerServiceInfo customerServiceInfo) {
        return customerServiceInfoMapper.select(customerServiceInfo);
    }

    @Override
    public CustomerServiceInfo getOne(CustomerServiceInfo customerServiceInfo) {
        return customerServiceInfoMapper.selectOne(customerServiceInfo);
    }

    @Override
    public Integer add(CustomerServiceInfo customerServiceInfo) {
        return customerServiceInfoMapper.insert(customerServiceInfo);
    }

    @Override
    public Integer del(CustomerServiceInfo customerServiceInfo) {
        return customerServiceInfoMapper.delete(customerServiceInfo);
    }

    @Override
    public Integer upd(CustomerServiceInfo customerServiceInfo) {
        return customerServiceInfoMapper.updateByPrimaryKey(customerServiceInfo);
    }
}
