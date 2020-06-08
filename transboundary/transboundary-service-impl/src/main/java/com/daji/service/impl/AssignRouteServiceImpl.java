package com.daji.service.impl;

import com.daji.mapper.AssignRouteMapper;
import com.daji.pojo.AssignRoute;
import com.daji.service.AssignRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignRouteServiceImpl implements AssignRouteService {

    @Autowired
    private AssignRouteMapper assignRouteMapper;

    @Override
    public List<AssignRoute> getAll() {
        return assignRouteMapper.selectAll();
    }

    @Override
    public List<AssignRoute> getData(AssignRoute assignRoute) {
        return assignRouteMapper.select(assignRoute);
    }

    @Override
    public AssignRoute getOne(AssignRoute assignRoute) {
        return assignRouteMapper.selectByPrimaryKey(assignRoute);
    }

    @Override
    public Integer add(AssignRoute assignRoute) {
        return assignRouteMapper.insert(assignRoute);
    }

    @Override
    public Integer del(AssignRoute assignRoute) {
        return assignRouteMapper.insert(assignRoute);
    }

    @Override
    public Integer upd(AssignRoute assignRoute) {
        return assignRouteMapper.updateByPrimaryKey(assignRoute);
    }
}
