package com.daji.service.impl;

import com.daji.mapper.BusinessTypeMapper;
import com.daji.pojo.BusinessType;
import com.daji.service.BusinessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessTypeServiceImpl implements BusinessTypeService {
    @Autowired
    private BusinessTypeMapper businessTypeMapper;

    @Override
    public List<BusinessType> getAll() {
        return businessTypeMapper.selectAll();
    }

    @Override
    public List<BusinessType> getData(BusinessType businessType) {
        return businessTypeMapper.select(businessType);
    }

    @Override
    public BusinessType getOne(BusinessType businessType) {
        return businessTypeMapper.selectByPrimaryKey(businessType);
    }

    @Override
    public Integer add(BusinessType businessType) {
        return businessTypeMapper.insert(businessType);
    }

    @Override
    public Integer del(BusinessType businessType) {
        return businessTypeMapper.delete(businessType);
    }

    @Override
    public Integer upd(BusinessType businessType) {
        return businessTypeMapper.updateByPrimaryKey(businessType);
    }
}
