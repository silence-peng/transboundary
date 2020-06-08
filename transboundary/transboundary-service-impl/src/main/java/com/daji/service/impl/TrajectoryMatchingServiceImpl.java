package com.daji.service.impl;

import com.daji.mapper.TrajectoryMatchingMapper;
import com.daji.pojo.TrajectoryMatching;
import com.daji.service.TrajectoryMatchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrajectoryMatchingServiceImpl implements TrajectoryMatchingService {

    @Autowired
    private TrajectoryMatchingMapper trajectoryMatchingMapper;

    @Override
    public List<TrajectoryMatching> getAll() {
        return trajectoryMatchingMapper.selectAll();
    }

    @Override
    public List<TrajectoryMatching> getData(TrajectoryMatching trajectoryMatching) {
        return trajectoryMatchingMapper.select(trajectoryMatching);
    }

    @Override
    public TrajectoryMatching getOne(TrajectoryMatching trajectoryMatching) {
        return trajectoryMatchingMapper.selectOne(trajectoryMatching);
    }

    @Override
    public Integer add(TrajectoryMatching trajectoryMatching) {
        return trajectoryMatchingMapper.insert(trajectoryMatching);
    }

    @Override
    public Integer del(TrajectoryMatching trajectoryMatching) {
        return trajectoryMatchingMapper.delete(trajectoryMatching);
    }

    @Override
    public Integer upd(TrajectoryMatching trajectoryMatching) {
        return trajectoryMatchingMapper.updateByPrimaryKey(trajectoryMatching);
    }
}
