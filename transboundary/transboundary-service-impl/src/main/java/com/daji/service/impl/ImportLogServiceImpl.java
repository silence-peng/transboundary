package com.daji.service.impl;

import com.daji.mapper.ImportLogMapper;
import com.daji.pojo.ImportLog;
import com.daji.service.ImportLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportLogServiceImpl implements ImportLogService {
    @Autowired
    private ImportLogMapper importLogMapper;
    @Override
    public List<ImportLog> getAll() {
        return importLogMapper.selectAll();
    }

    @Override
    public List<ImportLog> getData(ImportLog importLog) {
        return importLogMapper.select(importLog);
    }

    @Override
    public ImportLog getOne(ImportLog importLog) {
        return importLogMapper.selectByPrimaryKey(importLog);
    }

    @Override
    public Integer add(ImportLog importLog) {
        return importLogMapper.insert(importLog);
    }

    @Override
    public Integer del(ImportLog importLog) {
        return importLogMapper.delete(importLog);
    }

    @Override
    public Integer upd(ImportLog importLog) {
        return importLogMapper.updateByPrimaryKey(importLog);
    }
}
