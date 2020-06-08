package com.daji.service.impl;

import com.daji.mapper.CustomerManagementMapper;
import com.daji.pojo.CustomerManagement;
import com.daji.service.CustomerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManagementServiceImpl implements CustomerManagementService {
    @Autowired
    private CustomerManagementMapper customerManagementMapper;

    @Override
    public List<CustomerManagement> getAll() {
        return customerManagementMapper.selectAll();
    }

    @Override
    public List<CustomerManagement> getData(CustomerManagement customerManagement) {
        return customerManagementMapper.select(customerManagement);
    }

    @Override
    public CustomerManagement getOne(CustomerManagement customerManagement) {
        return customerManagementMapper.selectByPrimaryKey(customerManagement);
    }

    @Override
    public Integer add(CustomerManagement customerManagement) {
        return customerManagementMapper.insert(customerManagement);
    }

    @Override
    public Integer del(CustomerManagement customerManagement) {
        return customerManagementMapper.delete(customerManagement);
    }

    @Override
    public Integer upd(CustomerManagement customerManagement) {
        return customerManagementMapper.updateByPrimaryKey(customerManagement);
    }
}
