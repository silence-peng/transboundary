package com.daji.service.impl;

import com.daji.mapper.CargoInfoMapper;
import com.daji.pojo.CargoInfo;
import com.daji.service.CargoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoInfoServiceImpl implements CargoInfoService {
    @Autowired
    private CargoInfoMapper cargoInfoMapper;
    @Override
    public List<CargoInfo> getAll() {
        return cargoInfoMapper.selectAll();
    }

    @Override
    public List<CargoInfo> getData(CargoInfo cargoInfo) {
        return cargoInfoMapper.select(cargoInfo);
    }

    @Override
    public CargoInfo getOne(CargoInfo cargoInfo) {
        return cargoInfoMapper.selectByPrimaryKey(cargoInfo);
    }

    @Override
    public Integer add(CargoInfo cargoInfo) {
        return cargoInfoMapper.insert(cargoInfo);
    }

    @Override
    public Integer del(CargoInfo cargoInfo) {
        return cargoInfoMapper.delete(cargoInfo);
    }

    @Override
    public Integer upd(CargoInfo cargoInfo) {
        return cargoInfoMapper.updateByPrimaryKey(cargoInfo);
    }
}
