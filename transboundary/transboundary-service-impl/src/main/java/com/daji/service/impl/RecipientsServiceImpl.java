package com.daji.service.impl;

import com.daji.mapper.RecipientsMapper;
import com.daji.pojo.Recipients;
import com.daji.service.RecipientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipientsServiceImpl implements RecipientsService {
    @Autowired
    private RecipientsMapper recipientsMapper;
    @Override
    public List<Recipients> getAll() {
        return null;
    }

    @Override
    public List<Recipients> getData(Recipients recipients) {
        return recipientsMapper.select(recipients);
    }

    @Override
    public Recipients getOne(Recipients recipients) {
        return null;
    }

    @Override
    public Integer add(Recipients recipients) {
        return null;
    }

    @Override
    public Integer del(Recipients recipients) {
        return null;
    }

    @Override
    public Integer upd(Recipients recipients) {
        return null;
    }
}
