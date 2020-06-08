package com.daji.service.impl;

import com.daji.mapper.ShipmentRouteMapper;
import com.daji.pojo.ShipmentRoute;
import com.daji.service.ShipmentRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentRouteServiceImpl implements ShipmentRouteService {
    @Autowired
    private ShipmentRouteMapper shipmentRouteMapper;
    @Override
    public List<ShipmentRoute> getAll() {
        return shipmentRouteMapper.selectAll();
    }

    @Override
    public List<ShipmentRoute> getData(ShipmentRoute shipmentRoute) {
        return shipmentRouteMapper.select(shipmentRoute);
    }

    @Override
    public ShipmentRoute getOne(ShipmentRoute shipmentRoute) {
        return shipmentRouteMapper.selectOne(shipmentRoute);
    }

    @Override
    public Integer add(ShipmentRoute shipmentRoute) {
        return shipmentRouteMapper.insert(shipmentRoute);
    }

    @Override
    public Integer del(ShipmentRoute shipmentRoute) {
        return shipmentRouteMapper.delete(shipmentRoute);
    }

    @Override
    public Integer upd(ShipmentRoute shipmentRoute) {
        return shipmentRouteMapper.updateByPrimaryKey(shipmentRoute);
    }
}
