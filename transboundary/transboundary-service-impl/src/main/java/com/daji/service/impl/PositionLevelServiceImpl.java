package com.daji.service.impl;

import com.daji.mapper.PositionLevelMapper;
import com.daji.pojo.PositionLevel;
import com.daji.service.PositionLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionLevelServiceImpl implements PositionLevelService {
    @Autowired
    private PositionLevelMapper positionLevelMapper;
    @Override
    public List<PositionLevel> getAll() {
        return positionLevelMapper.selectAll();
    }

    @Override
    public List<PositionLevel> getData(PositionLevel positionLevel) {
        return positionLevelMapper.select(positionLevel);
    }

    @Override
    public PositionLevel getOne(PositionLevel positionLevel) {
        return positionLevelMapper.selectByPrimaryKey(positionLevel);
    }

    @Override
    public Integer add(PositionLevel positionLevel) {
        return positionLevelMapper.insert(positionLevel);
    }

    @Override
    public Integer del(PositionLevel positionLevel) {
        return positionLevelMapper.delete(positionLevel);
    }

    @Override
    public Integer upd(PositionLevel positionLevel) {
        return positionLevelMapper.updateByPrimaryKey(positionLevel);
    }
}
