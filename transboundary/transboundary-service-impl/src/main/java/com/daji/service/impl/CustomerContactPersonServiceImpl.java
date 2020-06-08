package com.daji.service.impl;

import com.daji.mapper.CustomerContactPersonMapper;
import com.daji.pojo.CustomerContactPerson;
import com.daji.service.CustomerContactPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerContactPersonServiceImpl implements CustomerContactPersonService {
    @Autowired
    private CustomerContactPersonMapper customerContactPersonMapper;

    @Override
    public List<CustomerContactPerson> getAll() {
        return customerContactPersonMapper.selectAll();
    }

    @Override
    public List<CustomerContactPerson> getData(CustomerContactPerson customerContactPerson) {
        return customerContactPersonMapper.select(customerContactPerson);
    }

    @Override
    public CustomerContactPerson getOne(CustomerContactPerson customerContactPerson) {
        return customerContactPersonMapper.selectByPrimaryKey(customerContactPerson);
    }

    @Override
    public Integer add(CustomerContactPerson customerContactPerson) {
        return customerContactPersonMapper.insert(customerContactPerson);
    }

    @Override
    public Integer del(CustomerContactPerson customerContactPerson) {
        return customerContactPersonMapper.delete(customerContactPerson);
    }

    @Override
    public Integer upd(CustomerContactPerson customerContactPerson) {
        return customerContactPersonMapper.updateByPrimaryKey(customerContactPerson);
    }
}
