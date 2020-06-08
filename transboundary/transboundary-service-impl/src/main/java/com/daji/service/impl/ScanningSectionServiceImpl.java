package com.daji.service.impl;

import com.daji.mapper.ScanningSectionMapper;
import com.daji.pojo.ScanningSection;
import com.daji.service.ScanningSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScanningSectionServiceImpl implements ScanningSectionService {
    @Autowired
    private ScanningSectionMapper scanningSectionMapper;
    @Override
    public List<ScanningSection> getAll() {
        return scanningSectionMapper.selectAll();
    }

    @Override
    public List<ScanningSection> getData(ScanningSection scanningSection) {
        return scanningSectionMapper.select(scanningSection);
    }

    @Override
    public ScanningSection getOne(ScanningSection scanningSection) {
        return scanningSectionMapper.selectByPrimaryKey(scanningSection);
    }

    @Override
    public Integer add(ScanningSection scanningSection) {
        return scanningSectionMapper.insert(scanningSection);
    }

    @Override
    public Integer del(ScanningSection scanningSection) {
        return scanningSectionMapper.delete(scanningSection);
    }

    @Override
    public Integer upd(ScanningSection scanningSection) {
        return scanningSectionMapper.updateByPrimaryKey(scanningSection);
    }
}
