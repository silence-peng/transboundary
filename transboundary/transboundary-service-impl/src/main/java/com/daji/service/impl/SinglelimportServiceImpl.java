package com.daji.service.impl;

import com.daji.mapper.AccessoryInfoMapper;
import com.daji.mapper.SinglelimportMapper;
import com.daji.pojo.AccessoryInfo;
import com.daji.pojo.SingleIimport;
import com.daji.service.AccessoryInfoService;
import com.daji.service.SinglelimportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinglelimportServiceImpl implements SinglelimportService {

    @Autowired
   private SinglelimportMapper singlelimportMapper;

    @Override
    public List<SingleIimport> getAll() {
        return singlelimportMapper.selectAll();
    }

    @Override
    public List<SingleIimport> getData(SingleIimport singleIimport) {
        return singlelimportMapper.select(singleIimport);
    }

    @Override
    public SingleIimport getOne(SingleIimport singleIimport) {
        return singlelimportMapper.selectOne(singleIimport);
    }

    @Override
    public Integer add(SingleIimport singleIimport) {
        return singlelimportMapper.insert(singleIimport);
    }

    @Override
    public Integer del(SingleIimport singleIimport) {
        return singlelimportMapper.delete(singleIimport);
    }

    @Override
    public Integer upd(SingleIimport singleIimport) {
        return singlelimportMapper.updateByPrimaryKey(singleIimport);
    }
}
