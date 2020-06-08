package com.daji.service.impl;

import com.daji.mapper.HandoverWaybillInfoMapper;
import com.daji.pojo.HandoverWaybillInfo;
import com.daji.service.HandoverWaybillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HandoverWaybillInfoServiceImpl implements HandoverWaybillInfoService {
    @Autowired
    private HandoverWaybillInfoMapper handoverWaybillInfoMapper;
    @Override
    public List<HandoverWaybillInfo> getAll() {
        return handoverWaybillInfoMapper.selectAll();
    }

    @Override
    public List<HandoverWaybillInfo> getData(HandoverWaybillInfo handoverWaybillInfo) {
        return handoverWaybillInfoMapper.select(handoverWaybillInfo);
    }

    @Override
    public HandoverWaybillInfo getOne(HandoverWaybillInfo handoverWaybillInfo) {
        return handoverWaybillInfoMapper.selectOne(handoverWaybillInfo);
    }

    @Override
    public Integer add(HandoverWaybillInfo handoverWaybillInfo) {
        return handoverWaybillInfoMapper.insert(handoverWaybillInfo);
    }

    @Override
    public Integer del(HandoverWaybillInfo handoverWaybillInfo) {
        return handoverWaybillInfoMapper.delete(handoverWaybillInfo);
    }

    @Override
    public Integer upd(HandoverWaybillInfo handoverWaybillInfo) {
        return handoverWaybillInfoMapper.updateByPrimaryKey(handoverWaybillInfo);
    }
}
