package com.daji.service.impl;

import com.daji.mapper.CustomerGroupMapper;
import com.daji.pojo.CustomerGroup;
import com.daji.service.CustomerGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerGroupServiceImpl implements CustomerGroupService {
    @Autowired
    private CustomerGroupMapper customerGroupMapper;

    @Override
    public List<CustomerGroup> getAll() {
        return customerGroupMapper.selectAll();
    }

    @Override
    public List<CustomerGroup> getData(CustomerGroup customerGroup) {
        return customerGroupMapper.select(customerGroup);
    }

    @Override
    public CustomerGroup getOne(CustomerGroup customerGroup) {
        return customerGroupMapper.selectByPrimaryKey(customerGroup);
    }

    @Override
    public Integer add(CustomerGroup customerGroup) {
        return customerGroupMapper.insert(customerGroup);
    }

    @Override
    public Integer del(CustomerGroup customerGroup) {
        return customerGroupMapper.delete(customerGroup);
    }

    @Override
    public Integer upd(CustomerGroup customerGroup) {
        return customerGroupMapper.updateByPrimaryKey(customerGroup);
    }
}
