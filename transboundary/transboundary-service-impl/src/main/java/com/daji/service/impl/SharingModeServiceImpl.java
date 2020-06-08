package com.daji.service.impl;

import com.daji.mapper.SharingModeMapper;
import com.daji.pojo.SharingMode;
import com.daji.service.SharingModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SharingModeServiceImpl implements SharingModeService {
    @Autowired
    private SharingModeMapper sharingModeMapper;

    @Override
    public List<SharingMode> getAll() {
        return sharingModeMapper.selectAll();
    }

    @Override
    public List<SharingMode> getData(SharingMode sharingMode) {
        return sharingModeMapper.select(sharingMode);
    }

    @Override
    public SharingMode getOne(SharingMode sharingMode) {
        return sharingModeMapper.selectOne(sharingMode);
    }

    @Override
    public Integer add(SharingMode sharingMode) {
        return sharingModeMapper.insert(sharingMode);
    }

    @Override
    public Integer del(SharingMode sharingMode) {
        return sharingModeMapper.delete(sharingMode);
    }

    @Override
    public Integer upd(SharingMode sharingMode) {
        return sharingModeMapper.updateByPrimaryKey(sharingMode);
    }
}
