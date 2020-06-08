package com.daji.service.impl;

import com.daji.mapper.DestinationMapper;
import com.daji.pojo.Destination;
import com.daji.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationServiceImpl implements DestinationService {
    @Autowired
    private DestinationMapper destinationMapper;

    @Override
    public List<Destination> getAll() {
        return destinationMapper.selectAll();
    }

    @Override
    public List<Destination> getData(Destination destination) {
        return destinationMapper.select(destination);
    }

    @Override
    public Destination getOne(Destination destination) {
        return destinationMapper.selectByPrimaryKey(destination);
    }

    @Override
    public Integer add(Destination destination) {
        return destinationMapper.insert(destination);
    }

    @Override
    public Integer del(Destination destination) {
        return destinationMapper.delete(destination);
    }

    @Override
    public Integer upd(Destination destination) {
        return destinationMapper.updateByPrimaryKey(destination);
    }
}
