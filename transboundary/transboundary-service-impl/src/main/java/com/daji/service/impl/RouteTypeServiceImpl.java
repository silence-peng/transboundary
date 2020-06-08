package com.daji.service.impl;

import com.daji.mapper.RouteTypeMapper;
import com.daji.pojo.RouteType;
import com.daji.service.RouteTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteTypeServiceImpl implements RouteTypeService {
    @Autowired
    private RouteTypeMapper routeTypeMapper;
    @Override
    public List<RouteType> getAll() {
        return routeTypeMapper.selectAll();
    }

    @Override
    public List<RouteType> getData(RouteType routeType) {
        return routeTypeMapper.select(routeType);
    }

    @Override
    public RouteType getOne(RouteType routeType) {
        return routeTypeMapper.selectByPrimaryKey(routeType);
    }

    @Override
    public Integer add(RouteType routeType) {
        return routeTypeMapper.insert(routeType);
    }

    @Override
    public Integer del(RouteType routeType) {
        return routeTypeMapper.delete(routeType);
    }

    @Override
    public Integer upd(RouteType routeType) {
        return routeTypeMapper.updateByPrimaryKey(routeType);
    }
}
