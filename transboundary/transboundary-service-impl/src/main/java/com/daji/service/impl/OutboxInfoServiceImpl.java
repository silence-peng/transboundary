package com.daji.service.impl;

import com.daji.mapper.OutboxInfoMapper;
import com.daji.pojo.OutboxInfo;
import com.daji.service.OutboxInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutboxInfoServiceImpl implements OutboxInfoService {
    @Autowired
    private OutboxInfoMapper outboxInfoMapper;
    @Override
    public List<OutboxInfo> getAll() {
        return outboxInfoMapper.selectAll();
    }

    @Override
    public List<OutboxInfo> getData(OutboxInfo outboxInfo) {
        return outboxInfoMapper.select(outboxInfo);
    }

    @Override
    public OutboxInfo getOne(OutboxInfo outboxInfo) {
        return outboxInfoMapper.selectOne(outboxInfo);
    }

    @Override
    public Integer add(OutboxInfo outboxInfo) {
        return outboxInfoMapper.insert(outboxInfo);
    }

    @Override
    public Integer del(OutboxInfo outboxInfo) {
        return outboxInfoMapper.delete(outboxInfo);
    }

    @Override
    public Integer upd(OutboxInfo outboxInfo) {
        return outboxInfoMapper.updateByPrimaryKey(outboxInfo);
    }
}
