package com.daji.service.impl;

import com.daji.mapper.PlaySingleInfoMapper;
import com.daji.pojo.PlaySingleInfo;
import com.daji.service.PlaySingleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaySingleInfoServiceImpl implements PlaySingleInfoService {
    @Autowired
    private PlaySingleInfoMapper playSingleInfoMapper;
    @Override
    public List<PlaySingleInfo> getAll() {
        return playSingleInfoMapper.selectAll();
    }

    @Override
    public List<PlaySingleInfo> getData(PlaySingleInfo playSingleInfo) {
        return playSingleInfoMapper.select(playSingleInfo);
    }

    @Override
    public PlaySingleInfo getOne(PlaySingleInfo playSingleInfo) {
        return playSingleInfoMapper.selectByPrimaryKey(playSingleInfo);
    }

    @Override
    public Integer add(PlaySingleInfo playSingleInfo) {
        return playSingleInfoMapper.insert(playSingleInfo);
    }

    @Override
    public Integer del(PlaySingleInfo playSingleInfo) {
        return playSingleInfoMapper.delete(playSingleInfo);
    }

    @Override
    public Integer upd(PlaySingleInfo playSingleInfo) {
        return playSingleInfoMapper.updateByPrimaryKey(playSingleInfo);
    }
}
