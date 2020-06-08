package com.daji.service.impl;

import com.daji.mapper.ImportTemplateInfoMapper;
import com.daji.pojo.ImportTemplateInfo;
import com.daji.service.ImportTemplateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportTemplateInfoServiceImpl implements ImportTemplateInfoService {
    @Autowired
    private ImportTemplateInfoMapper importTemplateInfoMapper;
    @Override
    public List<ImportTemplateInfo> getAll() {
        return importTemplateInfoMapper.selectAll();
    }

    @Override
    public List<ImportTemplateInfo> getData(ImportTemplateInfo importTemplateInfo) {
        return importTemplateInfoMapper.select(importTemplateInfo);
    }

    @Override
    public ImportTemplateInfo getOne(ImportTemplateInfo importTemplateInfo) {
        return importTemplateInfoMapper.selectByPrimaryKey(importTemplateInfo);
    }

    @Override
    public Integer add(ImportTemplateInfo importTemplateInfo) {
        return importTemplateInfoMapper.insert(importTemplateInfo);
    }

    @Override
    public Integer del(ImportTemplateInfo importTemplateInfo) {
        return importTemplateInfoMapper.delete(importTemplateInfo);
    }

    @Override
    public Integer upd(ImportTemplateInfo importTemplateInfo) {
        return importTemplateInfoMapper.updateByPrimaryKey(importTemplateInfo);
    }
}
