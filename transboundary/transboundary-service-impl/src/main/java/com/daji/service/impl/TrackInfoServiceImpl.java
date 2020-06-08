package com.daji.service.impl;

import com.daji.mapper.TrackInfoMapper;
import com.daji.pojo.TrackInfo;
import com.daji.service.TrackInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackInfoServiceImpl implements TrackInfoService {
    @Autowired
    private TrackInfoMapper trackInfoMapper;
    @Override
    public List<TrackInfo> getAll() {
        return trackInfoMapper.selectAll();
    }

    @Override
    public List<TrackInfo> getData(TrackInfo trackInfo) {
        return trackInfoMapper.select(trackInfo);
    }

    @Override
    public TrackInfo getOne(TrackInfo trackInfo) {
        return trackInfoMapper.selectOne(trackInfo);
    }

    @Override
    public Integer add(TrackInfo trackInfo) {
        return trackInfoMapper.insert(trackInfo);
    }

    @Override
    public Integer del(TrackInfo trackInfo) {
        return trackInfoMapper.delete(trackInfo);
    }

    @Override
    public Integer upd(TrackInfo trackInfo) {
        return trackInfoMapper.updateByPrimaryKey(trackInfo);
    }
}
