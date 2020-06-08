package com.daji.service.impl;

import com.daji.mapper.SingleRecordInfoMapper;
import com.daji.pojo.SingleRecordInfo;
import com.daji.service.SingleRecordInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingleRecordInfoServiceImpl implements SingleRecordInfoService {
    @Autowired
    private SingleRecordInfoMapper singleRecordInfoMapper;
    @Override
    public List<SingleRecordInfo> getAll() {
        return singleRecordInfoMapper.selectAll();
    }

    @Override
    public List<SingleRecordInfo> getData(SingleRecordInfo singleRecordInfo) {
        return singleRecordInfoMapper.select(singleRecordInfo);
    }

    @Override
    public SingleRecordInfo getOne(SingleRecordInfo singleRecordInfo) {
        return singleRecordInfoMapper.selectByPrimaryKey(singleRecordInfo);
    }

    @Override
    public Integer add(SingleRecordInfo singleRecordInfo) {
        return singleRecordInfoMapper.insert(singleRecordInfo);
    }

    @Override
    public Integer del(SingleRecordInfo singleRecordInfo) {
        return singleRecordInfoMapper.delete(singleRecordInfo);
    }

    @Override
    public Integer upd(SingleRecordInfo singleRecordInfo) {
        return singleRecordInfoMapper.updateByPrimaryKey(singleRecordInfo);
    }
}
