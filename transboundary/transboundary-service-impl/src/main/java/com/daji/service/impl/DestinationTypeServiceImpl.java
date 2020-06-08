package com.daji.service.impl;

import com.daji.mapper.DestinationTypeMapper;
import com.daji.pojo.DestinationType;
import com.daji.service.DestinationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationTypeServiceImpl implements DestinationTypeService {
    @Autowired
    private DestinationTypeMapper destinationTypeMapper;

    @Override
    public List<DestinationType> getAll() {
        return destinationTypeMapper.selectAll();
    }

    @Override
    public List<DestinationType> getData(DestinationType destinationType) {
        return destinationTypeMapper.select(destinationType);
    }

    @Override
    public DestinationType getOne(DestinationType destinationType) {
        return destinationTypeMapper.selectByPrimaryKey(destinationType);
    }

    @Override
    public Integer add(DestinationType destinationType) {
        return destinationTypeMapper.insert(destinationType);
    }

    @Override
    public Integer del(DestinationType destinationType) {
        return destinationTypeMapper.delete(destinationType);
    }

    @Override
    public Integer upd(DestinationType destinationType) {
        return destinationTypeMapper.updateByPrimaryKey(destinationType);
    }
}
