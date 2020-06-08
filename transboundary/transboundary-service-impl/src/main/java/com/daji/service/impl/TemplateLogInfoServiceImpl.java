package com.daji.service.impl;

import com.daji.mapper.TemplateLogInfoMapper;
import com.daji.pojo.TemplateLogInfo;
import com.daji.service.TemplateLogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateLogInfoServiceImpl implements TemplateLogInfoService {
    @Autowired
    private TemplateLogInfoMapper templateLogInfoMapper;
    @Override
    public List<TemplateLogInfo> getAll() {
        return templateLogInfoMapper.selectAll();
    }

    @Override
    public List<TemplateLogInfo> getData(TemplateLogInfo templateLogInfo) {
        return templateLogInfoMapper.select(templateLogInfo);
    }

    @Override
    public TemplateLogInfo getOne(TemplateLogInfo templateLogInfo) {
        return templateLogInfoMapper.selectByPrimaryKey(templateLogInfo);
    }

    @Override
    public Integer add(TemplateLogInfo templateLogInfo) {
        return templateLogInfoMapper.insert(templateLogInfo);
    }

    @Override
    public Integer del(TemplateLogInfo templateLogInfo) {
        return templateLogInfoMapper.delete(templateLogInfo);
    }

    @Override
    public Integer upd(TemplateLogInfo templateLogInfo) {
        return templateLogInfoMapper.updateByPrimaryKey(templateLogInfo);
    }
}
