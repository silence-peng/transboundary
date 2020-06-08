package com.daji.service.impl;

import com.daji.mapper.SenderMapper;
import com.daji.pojo.Sender;
import com.daji.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenderServiceImpl implements SenderService {
    @Autowired
    private SenderMapper senderMapper;
    @Override
    public List<Sender> getAll() {
        return senderMapper.selectAll();
    }

    @Override
    public List<Sender> getData(Sender sender) {
        return senderMapper.select(sender);
    }

    @Override
    public Sender getOne(Sender sender) {
        return senderMapper.selectOne(sender);
    }

    @Override
    public Integer add(Sender sender) {
        return senderMapper.insert(sender);
    }

    @Override
    public Integer del(Sender sender) {
        return senderMapper.delete(sender);
    }

    @Override
    public Integer upd(Sender sender) {
        return senderMapper.updateByPrimaryKey(sender);
    }
}
