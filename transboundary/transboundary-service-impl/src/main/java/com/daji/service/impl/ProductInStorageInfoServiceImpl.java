package com.daji.service.impl;

import com.daji.mapper.ProductInStorageInfoMapper;
import com.daji.pojo.ProductInStorageInfo;
import com.daji.service.ProductInStorageInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInStorageInfoServiceImpl implements ProductInStorageInfoService {
    @Autowired
    private ProductInStorageInfoMapper productInStorageInfoMapper;
    @Override
    public List<ProductInStorageInfo> getAll() {
        return productInStorageInfoMapper.selectAll();
    }

    @Override
    public List<ProductInStorageInfo> getData(ProductInStorageInfo productInStorageInfo) {
        return productInStorageInfoMapper.select(productInStorageInfo);
    }

    @Override
    public ProductInStorageInfo getOne(ProductInStorageInfo productInStorageInfo) {
        return productInStorageInfoMapper.selectOne(productInStorageInfo);
    }

    @Override
    public Integer add(ProductInStorageInfo productInStorageInfo) {
        return productInStorageInfoMapper.insert(productInStorageInfo);
    }

    @Override
    public Integer del(ProductInStorageInfo productInStorageInfo) {
        return productInStorageInfoMapper.delete(productInStorageInfo);
    }

    @Override
    public Integer upd(ProductInStorageInfo productInStorageInfo) {
        return productInStorageInfoMapper.updateByPrimaryKey(productInStorageInfo);
    }
}
