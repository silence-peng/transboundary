package com.daji.service.impl;

import com.daji.mapper.ChildTrackInfoMapper;
import com.daji.pojo.ChildTrackInfo;
import com.daji.service.ChildTrackInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildTrackInfoServiceImpl implements ChildTrackInfoService {
    @Autowired
    private ChildTrackInfoMapper childTrackInfoMapper;
    @Override
    public List<ChildTrackInfo> getAll() {
        return childTrackInfoMapper.selectAll();
    }

    @Override
    public List<ChildTrackInfo> getData(ChildTrackInfo childTrackInfo) {
        return childTrackInfoMapper.select(childTrackInfo);
    }

    @Override
    public ChildTrackInfo getOne(ChildTrackInfo childTrackInfo) {
        return childTrackInfoMapper.selectOne(childTrackInfo);
    }

    @Override
    public Integer add(ChildTrackInfo childTrackInfo) {
        return childTrackInfoMapper.insert(childTrackInfo);
    }

    @Override
    public Integer del(ChildTrackInfo childTrackInfo) {
        return childTrackInfoMapper.delete(childTrackInfo);
    }

    @Override
    public Integer upd(ChildTrackInfo childTrackInfo) {
        return childTrackInfoMapper.updateByPrimaryKey(childTrackInfo);
    }
}
