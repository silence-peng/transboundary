package com.daji.service.impl;

import com.daji.mapper.UjnauthorizedNetworkMapper;
import com.daji.pojo.UjnauthorizedNetwork;
import com.daji.service.UjnauthorizedNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UjnauthorizedNetworkServiceImpl implements UjnauthorizedNetworkService {

    @Autowired
    private UjnauthorizedNetworkMapper ujnauthorizedNetworkMapper;

    @Override
    public List<UjnauthorizedNetwork> getAll() {
        return ujnauthorizedNetworkMapper.selectAll();
    }

    @Override
    public List<UjnauthorizedNetwork> getData(UjnauthorizedNetwork ujnauthorizedNetwork) {
        return ujnauthorizedNetworkMapper.select(ujnauthorizedNetwork);
    }

    @Override
    public UjnauthorizedNetwork getOne(UjnauthorizedNetwork ujnauthorizedNetwork) {
        return ujnauthorizedNetworkMapper.selectOne(ujnauthorizedNetwork);
    }

    @Override
    public Integer add(UjnauthorizedNetwork ujnauthorizedNetwork) {
        return ujnauthorizedNetworkMapper.insert(ujnauthorizedNetwork);
    }

    @Override
    public Integer del(UjnauthorizedNetwork ujnauthorizedNetwork) {
        return ujnauthorizedNetworkMapper.delete(ujnauthorizedNetwork);
    }

    @Override
    public Integer upd(UjnauthorizedNetwork ujnauthorizedNetwork) {
        return ujnauthorizedNetworkMapper.updateByPrimaryKey(ujnauthorizedNetwork);
    }
}
