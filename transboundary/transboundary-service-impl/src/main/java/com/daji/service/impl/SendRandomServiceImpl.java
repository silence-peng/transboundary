package com.daji.service.impl;

import com.daji.mapper.SendRandomMapper;
import com.daji.pojo.SendRandom;
import com.daji.service.SendRandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendRandomServiceImpl implements SendRandomService {
    @Autowired
    private SendRandomMapper sendRandomMapper;

    @Override
    public List<SendRandom> getAll() {
        return sendRandomMapper.selectAll();
    }

    @Override
    public List<SendRandom> getData(SendRandom sendRandom) {
        return sendRandomMapper.select(sendRandom);
    }

    @Override
    public SendRandom getOne(SendRandom sendRandom) {
        return sendRandomMapper.selectOne(sendRandom);
    }

    @Override
    public Integer add(SendRandom sendRandom) {
        return sendRandomMapper.insert(sendRandom);
    }

    @Override
    public Integer del(SendRandom sendRandom) {
        return sendRandomMapper.delete(sendRandom);
    }

    @Override
    public Integer upd(SendRandom sendRandom) {
        return sendRandomMapper.updateByPrimaryKey(sendRandom);
    }
}
