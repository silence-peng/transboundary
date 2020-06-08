package com.daji.service.impl;

import com.daji.mapper.TransferInfoMapper;
import com.daji.pojo.TransferInfo;
import com.daji.service.TransferInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferInfoServiceImpl implements TransferInfoService {
    @Autowired
    private TransferInfoMapper transferInfoMapper;
    @Override
    public List<TransferInfo> getAll() {
        return transferInfoMapper.selectAll();
    }

    @Override
    public List<TransferInfo> getData(TransferInfo transferInfo) {
        return transferInfoMapper.select(transferInfo);
    }

    @Override
    public TransferInfo getOne(TransferInfo transferInfo) {
        return transferInfoMapper.selectByPrimaryKey(transferInfo);
    }

    @Override
    public Integer add(TransferInfo transferInfo) {
        return transferInfoMapper.insert(transferInfo);
    }

    @Override
    public Integer del(TransferInfo transferInfo) {
        return transferInfoMapper.delete(transferInfo);
    }

    @Override
    public Integer upd(TransferInfo transferInfo) {
        return transferInfoMapper.updateByPrimaryKey(transferInfo);
    }
}
