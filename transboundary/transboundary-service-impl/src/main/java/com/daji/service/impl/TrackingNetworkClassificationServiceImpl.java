package com.daji.service.impl;

import com.daji.mapper.TrackingNetworkClassificationMapper;
import com.daji.pojo.TrackingNetworkClassification;
import com.daji.service.TrackingNetworkClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackingNetworkClassificationServiceImpl implements TrackingNetworkClassificationService {
    @Autowired
    private TrackingNetworkClassificationMapper trackingNetworkClassificationMapper;
    @Override
    public List<TrackingNetworkClassification> getAll() {
        return trackingNetworkClassificationMapper.selectAll();
    }

    @Override
    public List<TrackingNetworkClassification> getData(TrackingNetworkClassification trackingNetworkClassification) {
        return trackingNetworkClassificationMapper.select(trackingNetworkClassification);
    }

    @Override
    public TrackingNetworkClassification getOne(TrackingNetworkClassification trackingNetworkClassification) {
        return trackingNetworkClassificationMapper.selectOne(trackingNetworkClassification);
    }

    @Override
    public Integer add(TrackingNetworkClassification trackingNetworkClassification) {
        return trackingNetworkClassificationMapper.insert(trackingNetworkClassification);
    }

    @Override
    public Integer del(TrackingNetworkClassification trackingNetworkClassification) {
        return trackingNetworkClassificationMapper.delete(trackingNetworkClassification);
    }

    @Override
    public Integer upd(TrackingNetworkClassification trackingNetworkClassification) {
        return trackingNetworkClassificationMapper.updateByPrimaryKey(trackingNetworkClassification);
    }
}
