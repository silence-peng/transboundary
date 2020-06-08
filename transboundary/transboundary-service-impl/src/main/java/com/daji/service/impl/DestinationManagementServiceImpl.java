package com.daji.service.impl;

import com.daji.mapper.DestinationManagementMapper;
import com.daji.pojo.DestinationManagement;
import com.daji.service.DestinationManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationManagementServiceImpl implements DestinationManagementService {
    @Autowired
    private DestinationManagementMapper destinationManagementMapper;

    @Override
    public List<DestinationManagement> getAll() {
        return destinationManagementMapper.selectAll();
    }

    @Override
    public List<DestinationManagement> getData(DestinationManagement destinationManagement) {
        return destinationManagementMapper.select(destinationManagement);
    }

    @Override
    public DestinationManagement getOne(DestinationManagement destinationManagement) {
        return destinationManagementMapper.selectByPrimaryKey(destinationManagement);
    }

    @Override
    public Integer add(DestinationManagement destinationManagement) {
        return destinationManagementMapper.insert(destinationManagement);
    }

    @Override
    public Integer del(DestinationManagement destinationManagement) {
        return destinationManagementMapper.delete(destinationManagement);
    }

    @Override
    public Integer upd(DestinationManagement destinationManagement) {
        return destinationManagementMapper.updateByPrimaryKey(destinationManagement);
    }
}
