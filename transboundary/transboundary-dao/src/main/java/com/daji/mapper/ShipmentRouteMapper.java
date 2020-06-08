package com.daji.mapper;

import com.daji.pojo.ShipmentRoute;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("shipmentRouteMapper")
public interface ShipmentRouteMapper extends tk.mybatis.mapper.common.Mapper<ShipmentRoute> {
}
