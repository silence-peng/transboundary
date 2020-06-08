package com.daji.service.impl;

import com.daji.mapper.FollowLogInfoMapper;
import com.daji.pojo.FollowLogInfo;
import com.daji.service.FollowLogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowLogInfoServiceImpl implements FollowLogInfoService {
    @Autowired
    private FollowLogInfoMapper followLogInfoMapper;
    @Override
    public List<FollowLogInfo> getAll() {
        return followLogInfoMapper.selectAll();
    }

    @Override
    public List<FollowLogInfo> getData(FollowLogInfo followLogInfo) {
        return followLogInfoMapper.select(followLogInfo);
    }

    @Override
    public FollowLogInfo getOne(FollowLogInfo followLogInfo) {
        return followLogInfoMapper.selectOne(followLogInfo);
    }

    @Override
    public Integer add(FollowLogInfo followLogInfo) {
        return followLogInfoMapper.insert(followLogInfo);
    }

    @Override
    public Integer del(FollowLogInfo followLogInfo) {
        return followLogInfoMapper.delete(followLogInfo);
    }

    @Override
    public Integer upd(FollowLogInfo followLogInfo) {
        return followLogInfoMapper.updateByPrimaryKey(followLogInfo);
    }
}
