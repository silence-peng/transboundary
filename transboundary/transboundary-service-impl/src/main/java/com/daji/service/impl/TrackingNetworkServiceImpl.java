package com.daji.service.impl;

import com.daji.mapper.StatusAfterMapper;
import com.daji.mapper.TrackingNetworkMapper;
import com.daji.pojo.StatusAfter;
import com.daji.pojo.TrackingNetwork;
import com.daji.service.StatusAfterService;
import com.daji.service.TrackingNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackingNetworkServiceImpl implements TrackingNetworkService {

    @Autowired
   private TrackingNetworkMapper trackingNetworkMapper;

    @Override
    public List<TrackingNetwork> getAll() {
        return trackingNetworkMapper.selectAll();
    }

    @Override
    public List<TrackingNetwork> getData(TrackingNetwork trackingNetwork) {
        return trackingNetworkMapper.select(trackingNetwork);
    }

    @Override
    public TrackingNetwork getOne(TrackingNetwork trackingNetwork) {
        return trackingNetworkMapper.selectOne(trackingNetwork);
    }

    @Override
    public Integer add(TrackingNetwork trackingNetwork) {
        return trackingNetworkMapper.insert(trackingNetwork);
    }

    @Override
    public Integer del(TrackingNetwork trackingNetwork) {
        return trackingNetworkMapper.delete(trackingNetwork);
    }

    @Override
    public Integer upd(TrackingNetwork trackingNetwork) {
        return trackingNetworkMapper.updateByPrimaryKey(trackingNetwork);
    }
}
