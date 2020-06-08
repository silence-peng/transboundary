package com.daji.service.impl;

import com.daji.mapper.EnglishDescriptionMapper;
import com.daji.pojo.EnglishDescription;
import com.daji.service.EnglishDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnglishDescriptionServiceImpl implements EnglishDescriptionService {
    @Autowired
    private EnglishDescriptionMapper englishDescriptionMapper;

    @Override
    public List<EnglishDescription> getAll() {
        return englishDescriptionMapper.selectAll();
    }

    @Override
    public List<EnglishDescription> getData(EnglishDescription englishDescription) {
        return englishDescriptionMapper.select(englishDescription);
    }

    @Override
    public EnglishDescription getOne(EnglishDescription englishDescription) {
        return englishDescriptionMapper.selectByPrimaryKey(englishDescription);
    }

    @Override
    public Integer add(EnglishDescription englishDescription) {
        return englishDescriptionMapper.insert(englishDescription);
    }

    @Override
    public Integer del(EnglishDescription englishDescription) {
        return englishDescriptionMapper.delete(englishDescription);
    }

    @Override
    public Integer upd(EnglishDescription englishDescription) {
        return englishDescriptionMapper.updateByPrimaryKey(englishDescription);
    }
}
