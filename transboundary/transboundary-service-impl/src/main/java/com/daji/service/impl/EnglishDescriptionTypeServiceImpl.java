package com.daji.service.impl;

import com.daji.mapper.EnglishDescriptionTypeMapper;
import com.daji.pojo.EnglishDescriptionType;
import com.daji.service.EnglishDescriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnglishDescriptionTypeServiceImpl implements EnglishDescriptionTypeService {
    @Autowired
    private EnglishDescriptionTypeMapper englishDescriptionTypeMapper;

    @Override
    public List<EnglishDescriptionType> getAll() {
        return englishDescriptionTypeMapper.selectAll();
    }

    @Override
    public List<EnglishDescriptionType> getData(EnglishDescriptionType englishDescriptionType) {
        return englishDescriptionTypeMapper.select(englishDescriptionType);
    }

    @Override
    public EnglishDescriptionType getOne(EnglishDescriptionType englishDescriptionType) {
        return englishDescriptionTypeMapper.selectByPrimaryKey(englishDescriptionType);
    }

    @Override
    public Integer add(EnglishDescriptionType englishDescriptionType) {
        return englishDescriptionTypeMapper.insert(englishDescriptionType);
    }

    @Override
    public Integer del(EnglishDescriptionType englishDescriptionType) {
        return englishDescriptionTypeMapper.delete(englishDescriptionType);
    }

    @Override
    public Integer upd(EnglishDescriptionType englishDescriptionType) {
        return englishDescriptionTypeMapper.updateByPrimaryKey(englishDescriptionType);
    }
}
