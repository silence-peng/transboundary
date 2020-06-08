package com.daji.service.impl;

import com.daji.mapper.PrintRecordInfoMapper;
import com.daji.pojo.PrintRecordInfo;
import com.daji.service.PrintRecordInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrintRecordInfoServiceImpl implements PrintRecordInfoService {
    @Autowired
    private PrintRecordInfoMapper printRecordInfoMapper;
    @Override
    public List<PrintRecordInfo> getAll() {
        return printRecordInfoMapper.selectAll();
    }

    @Override
    public List<PrintRecordInfo> getData(PrintRecordInfo printRecordInfo) {
        return printRecordInfoMapper.select(printRecordInfo);
    }

    @Override
    public PrintRecordInfo getOne(PrintRecordInfo printRecordInfo) {
        return printRecordInfoMapper.selectOne(printRecordInfo);
    }

    @Override
    public Integer add(PrintRecordInfo printRecordInfo) {
        return printRecordInfoMapper.insert(printRecordInfo);
    }

    @Override
    public Integer del(PrintRecordInfo printRecordInfo) {
        return printRecordInfoMapper.delete(printRecordInfo);
    }

    @Override
    public Integer upd(PrintRecordInfo printRecordInfo) {
        return printRecordInfoMapper.updateByPrimaryKey(printRecordInfo);
    }
}
