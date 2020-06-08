package com.daji.service.impl;

import com.daji.mapper.MainLineTracksMapper;
import com.daji.pojo.MainLineTracks;
import com.daji.service.MainLineTracksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainLineTracksServiceImpl implements MainLineTracksService {
    @Autowired
    private MainLineTracksMapper mainLineTracksMapper;
    @Override
    public List<MainLineTracks> getAll() {
        return mainLineTracksMapper.selectAll();
    }

    @Override
    public List<MainLineTracks> getData(MainLineTracks mainLineTracks) {
        return mainLineTracksMapper.select(mainLineTracks);
    }

    @Override
    public MainLineTracks getOne(MainLineTracks mainLineTracks) {
        return mainLineTracksMapper.selectByPrimaryKey(mainLineTracks);
    }

    @Override
    public Integer add(MainLineTracks mainLineTracks) {
        return mainLineTracksMapper.insert(mainLineTracks);
    }

    @Override
    public Integer del(MainLineTracks mainLineTracks) {
        return mainLineTracksMapper.delete(mainLineTracks);
    }

    @Override
    public Integer upd(MainLineTracks mainLineTracks) {
        return mainLineTracksMapper.updateByPrimaryKey(mainLineTracks);
    }
}
