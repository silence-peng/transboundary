package com.daji.service.impl;

import com.daji.mapper.TransportInfoMapper;
import com.daji.pojo.TransportInfo;
import com.daji.service.TransportInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportInfoServiceImpl implements TransportInfoService {
    @Autowired
    private TransportInfoMapper transportInfoMapper;
    @Override
    public List<TransportInfo> getAll() {
        return transportInfoMapper.selectAll();
    }

    @Override
    public List<TransportInfo> getData(TransportInfo transportInfo) {
        return transportInfoMapper.select(transportInfo);
    }

    @Override
    public TransportInfo getOne(TransportInfo transportInfo) {
        return transportInfoMapper.selectOne(transportInfo);
    }

    @Override
    public Integer add(TransportInfo transportInfo) {
        return transportInfoMapper.insert(transportInfo);
    }

    @Override
    public Integer del(TransportInfo transportInfo) {
        return transportInfoMapper.delete(transportInfo);
    }

    @Override
    public Integer upd(TransportInfo transportInfo) {
        return transportInfoMapper.updateByPrimaryKey(transportInfo);
    }
}
