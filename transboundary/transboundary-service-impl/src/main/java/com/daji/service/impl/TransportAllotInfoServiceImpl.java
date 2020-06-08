package com.daji.service.impl;

import com.daji.mapper.TransportAllotInfoMapper;
import com.daji.pojo.TransportAllotInfo;
import com.daji.service.TransportAllotInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportAllotInfoServiceImpl implements TransportAllotInfoService {
    @Autowired
    private TransportAllotInfoMapper transportAllotInfoMapper;
    @Override
    public List<TransportAllotInfo> getAll() {
        return transportAllotInfoMapper.selectAll();
    }

    @Override
    public List<TransportAllotInfo> getData(TransportAllotInfo transportAllotInfo) {
        return transportAllotInfoMapper.select(transportAllotInfo);
    }

    @Override
    public TransportAllotInfo getOne(TransportAllotInfo transportAllotInfo) {
        return transportAllotInfoMapper.selectOne(transportAllotInfo);
    }

    @Override
    public Integer add(TransportAllotInfo transportAllotInfo) {
        return transportAllotInfoMapper.insert(transportAllotInfo);
    }

    @Override
    public Integer del(TransportAllotInfo transportAllotInfo) {
        return transportAllotInfoMapper.delete(transportAllotInfo);
    }

    @Override
    public Integer upd(TransportAllotInfo transportAllotInfo) {
        return transportAllotInfoMapper.updateByPrimaryKey(transportAllotInfo);
    }
}
