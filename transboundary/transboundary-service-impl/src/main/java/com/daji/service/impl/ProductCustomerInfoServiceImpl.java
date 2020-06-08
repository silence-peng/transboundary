package com.daji.service.impl;

import com.daji.mapper.ProductCustomerInfoMapper;
import com.daji.pojo.ProductCustomerInfo;
import com.daji.service.ProductCustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCustomerInfoServiceImpl implements ProductCustomerInfoService {
    @Autowired
    private ProductCustomerInfoMapper productCustomerInfoMapper;
    @Override
    public List<ProductCustomerInfo> getAll() {
        return productCustomerInfoMapper.selectAll();
    }

    @Override
    public List<ProductCustomerInfo> getData(ProductCustomerInfo productCustomerInfo) {
        return productCustomerInfoMapper.select(productCustomerInfo);
    }

    @Override
    public ProductCustomerInfo getOne(ProductCustomerInfo productCustomerInfo) {
        return productCustomerInfoMapper.selectOne(productCustomerInfo);
    }

    @Override
    public Integer add(ProductCustomerInfo productCustomerInfo) {
        return productCustomerInfoMapper.insert(productCustomerInfo);
    }

    @Override
    public Integer del(ProductCustomerInfo productCustomerInfo) {
        return productCustomerInfoMapper.delete(productCustomerInfo);
    }

    @Override
    public Integer upd(ProductCustomerInfo productCustomerInfo) {
        return productCustomerInfoMapper.updateByPrimaryKey(productCustomerInfo);
    }
}
