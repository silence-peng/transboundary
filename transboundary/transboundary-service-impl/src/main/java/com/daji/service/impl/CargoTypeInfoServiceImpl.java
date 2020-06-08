package com.daji.service.impl;

import com.daji.mapper.CargoTypeInfoMapper;
import com.daji.pojo.CargoTypeInfo;
import com.daji.service.CargoTypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoTypeInfoServiceImpl implements CargoTypeInfoService {
    @Autowired
    private CargoTypeInfoMapper cargoTypeInfoMapper;
    @Override
    public List<CargoTypeInfo> getAll() {
        return cargoTypeInfoMapper.selectAll();
    }

    @Override
    public List<CargoTypeInfo> getData(CargoTypeInfo cargoTypeInfo) {
        return cargoTypeInfoMapper.select(cargoTypeInfo);
    }

    @Override
    public CargoTypeInfo getOne(CargoTypeInfo cargoTypeInfo) {
        return cargoTypeInfoMapper.selectOne(cargoTypeInfo);
    }

    @Override
    public Integer add(CargoTypeInfo cargoTypeInfo) {
        return cargoTypeInfoMapper.insert(cargoTypeInfo);
    }

    @Override
    public Integer del(CargoTypeInfo cargoTypeInfo) {
        return cargoTypeInfoMapper.delete(cargoTypeInfo);
    }

    @Override
    public Integer upd(CargoTypeInfo cargoTypeInfo) {
        return cargoTypeInfoMapper.updateByPrimaryKey(cargoTypeInfo);
    }
}
