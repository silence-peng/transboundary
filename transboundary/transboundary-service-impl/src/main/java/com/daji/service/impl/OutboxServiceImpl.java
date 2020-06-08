package com.daji.service.impl;

import com.daji.mapper.OutboxMapper;
import com.daji.pojo.Outbox;
import com.daji.service.OutboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutboxServiceImpl implements OutboxService {
    @Autowired
    private OutboxMapper outboxMapper;

    @Override
    public List<Outbox> getAll() {
        return outboxMapper.selectAll();
    }

    @Override
    public List<Outbox> getData(Outbox outbox) {
        return outboxMapper.select(outbox);
    }

    @Override
    public Outbox getOne(Outbox outbox) {
        return outboxMapper.selectByPrimaryKey(outbox);
    }

    @Override
    public Integer add(Outbox outbox) {
        return outboxMapper.insert(outbox);
    }

    @Override
    public Integer del(Outbox outbox) {
        return outboxMapper.delete(outbox);
    }

    @Override
    public Integer upd(Outbox outbox) {
        return outboxMapper.updateByPrimaryKey(outbox);
    }
}
