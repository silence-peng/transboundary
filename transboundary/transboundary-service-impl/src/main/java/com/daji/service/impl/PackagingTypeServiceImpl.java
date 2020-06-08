package com.daji.service.impl;

import com.daji.mapper.PackagingTypeMapper;
import com.daji.pojo.PackagingType;
import com.daji.service.PackagingTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackagingTypeServiceImpl implements PackagingTypeService {
    @Autowired
    private PackagingTypeMapper packagingTypeMapper;
    @Override
    public List<PackagingType> getAll() {
        return packagingTypeMapper.selectAll();
    }

    @Override
    public List<PackagingType> getData(PackagingType packagingType) {
        return packagingTypeMapper.select(packagingType);
    }

    @Override
    public PackagingType getOne(PackagingType packagingType) {
        return packagingTypeMapper.selectByPrimaryKey(packagingType);
    }

    @Override
    public Integer add(PackagingType packagingType) {
        return packagingTypeMapper.insert(packagingType);
    }

    @Override
    public Integer del(PackagingType packagingType) {
        return packagingTypeMapper.delete(packagingType);
    }

    @Override
    public Integer upd(PackagingType packagingType) {
        return packagingTypeMapper.updateByPrimaryKey(packagingType);
    }
}
