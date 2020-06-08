package com.daji.service.impl;

import com.daji.mapper.PositionManagementMapper;
import com.daji.pojo.PositionManagement;
import com.daji.service.PositionManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManagementServiceImpl implements PositionManagementService {
    @Autowired
    private PositionManagementMapper positionManagementMapper;
    @Override
    public List<PositionManagement> getAll() {
        return positionManagementMapper.selectAll();
    }

    @Override
    public List<PositionManagement> getData(PositionManagement positionManagement) {
        return positionManagementMapper.select(positionManagement);
    }

    @Override
    public PositionManagement getOne(PositionManagement positionManagement) {
        return positionManagementMapper.selectByPrimaryKey(positionManagement);
    }

    @Override
    public Integer add(PositionManagement positionManagement) {
        return positionManagementMapper.insert(positionManagement);
    }

    @Override
    public Integer del(PositionManagement positionManagement) {
        return positionManagementMapper.delete(positionManagement);
    }

    @Override
    public Integer upd(PositionManagement positionManagement) {
        return positionManagementMapper.updateByPrimaryKey(positionManagement);
    }
}
