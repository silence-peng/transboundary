package com.daji.service.impl;

import com.daji.mapper.MessageRecordInfoMapper;
import com.daji.pojo.MessageRecordInfo;
import com.daji.service.MessageRecordInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageRecordInfoServiceImpl implements MessageRecordInfoService {
    @Autowired
    private MessageRecordInfoMapper messageRecordInfoMapper;
    @Override
    public List<MessageRecordInfo> getAll() {
        return messageRecordInfoMapper.selectAll();
    }

    @Override
    public List<MessageRecordInfo> getData(MessageRecordInfo messageRecordInfo) {
        return messageRecordInfoMapper.select(messageRecordInfo);
    }

    @Override
    public MessageRecordInfo getOne(MessageRecordInfo messageRecordInfo) {
        return messageRecordInfoMapper.selectOne(messageRecordInfo);
    }

    @Override
    public Integer add(MessageRecordInfo messageRecordInfo) {
        return messageRecordInfoMapper.insert(messageRecordInfo);
    }

    @Override
    public Integer del(MessageRecordInfo messageRecordInfo) {
        return messageRecordInfoMapper.delete(messageRecordInfo);
    }

    @Override
    public Integer upd(MessageRecordInfo messageRecordInfo) {
        return messageRecordInfoMapper.updateByPrimaryKey(messageRecordInfo);
    }
}
