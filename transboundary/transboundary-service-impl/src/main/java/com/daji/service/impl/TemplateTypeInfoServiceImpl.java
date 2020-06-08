package com.daji.service.impl;

import com.daji.mapper.TemplateTypeInfoMapper;
import com.daji.pojo.TemplateTypeInfo;
import com.daji.service.TemplateTypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateTypeInfoServiceImpl implements TemplateTypeInfoService {
    @Autowired
    private TemplateTypeInfoMapper templateTypeInfoMapper;
    @Override
    public List<TemplateTypeInfo> getAll() {
        return templateTypeInfoMapper.selectAll();
    }

    @Override
    public List<TemplateTypeInfo> getData(TemplateTypeInfo templateTypeInfo) {
        return templateTypeInfoMapper.select(templateTypeInfo);
    }

    @Override
    public TemplateTypeInfo getOne(TemplateTypeInfo templateTypeInfo) {
        return templateTypeInfoMapper.selectByPrimaryKey(templateTypeInfo);
    }

    @Override
    public Integer add(TemplateTypeInfo templateTypeInfo) {
        return templateTypeInfoMapper.insert(templateTypeInfo);
    }

    @Override
    public Integer del(TemplateTypeInfo templateTypeInfo) {
        return templateTypeInfoMapper.delete(templateTypeInfo);
    }

    @Override
    public Integer upd(TemplateTypeInfo templateTypeInfo) {
        return templateTypeInfoMapper.updateByPrimaryKey(templateTypeInfo);
    }
}
