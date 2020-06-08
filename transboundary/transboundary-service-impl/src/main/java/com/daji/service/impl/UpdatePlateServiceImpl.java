package com.daji.service.impl;

import com.daji.mapper.UpdatePlateMapper;
import com.daji.pojo.UpdatePlate;
import com.daji.service.UpdatePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpdatePlateServiceImpl implements UpdatePlateService {

    @Autowired
    private UpdatePlateMapper updatePlateMapper;


    @Override
    public List<UpdatePlate> getAll() {
        return updatePlateMapper.selectAll();
    }

    @Override
    public List<UpdatePlate> getData(UpdatePlate updatePlate) {
        return updatePlateMapper.select(updatePlate);
    }

    @Override
    public UpdatePlate getOne(UpdatePlate updatePlate) {
        return updatePlateMapper.selectOne(updatePlate);
    }

    @Override
    public Integer add(UpdatePlate updatePlate) {
        return updatePlateMapper.insert(updatePlate);
    }

    @Override
    public Integer del(UpdatePlate updatePlate) {
        return updatePlateMapper.delete(updatePlate);
    }

    @Override
    public Integer upd(UpdatePlate updatePlate) {
        return updatePlateMapper.updateByPrimaryKey(updatePlate);
    }
}
