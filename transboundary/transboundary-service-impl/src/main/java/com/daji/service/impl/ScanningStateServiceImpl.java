package com.daji.service.impl;

import com.daji.mapper.ScanningStateMapper;
import com.daji.pojo.ScanningState;
import com.daji.service.ScanningStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScanningStateServiceImpl implements ScanningStateService {
    @Autowired
    private ScanningStateMapper scanningStateMapper;
    @Override
    public List<ScanningState> getAll() {
        return scanningStateMapper.selectAll();
    }

    @Override
    public List<ScanningState> getData(ScanningState scanningState) {
        return scanningStateMapper.select(scanningState);
    }

    @Override
    public ScanningState getOne(ScanningState scanningState) {
        return scanningStateMapper.selectByPrimaryKey(scanningState);
    }

    @Override
    public Integer add(ScanningState scanningState) {
        return scanningStateMapper.insert(scanningState);
    }

    @Override
    public Integer del(ScanningState scanningState) {
        return scanningStateMapper.delete(scanningState);
    }

    @Override
    public Integer upd(ScanningState scanningState) {
        return scanningStateMapper.updateByPrimaryKey(scanningState);
    }
}
