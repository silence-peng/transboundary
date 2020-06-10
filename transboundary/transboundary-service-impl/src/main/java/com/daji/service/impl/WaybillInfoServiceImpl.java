package com.daji.service.impl;


import com.daji.mapper.OrderMapper;
import com.daji.mapper.WaybillInfoMapper;
import com.daji.pojo.WaybillInfo;
import com.daji.service.WaybillInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillInfoServiceImpl implements WaybillInfoService {
    @Autowired
    private WaybillInfoMapper waybillInfoMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<WaybillInfo> getAll() {
        return waybillInfoMapper.selectAll();
    }

    @Override
    public List<WaybillInfo> getData(WaybillInfo waybillInfo) {
        return waybillInfoMapper.select(waybillInfo);
    }

    @Override
    public WaybillInfo getOne(WaybillInfo waybillInfo) {
        return waybillInfoMapper.selectByPrimaryKey(waybillInfo);
    }

    @Override
    public Integer add(WaybillInfo waybillInfo) {
        return waybillInfoMapper.insert(waybillInfo);
    }

    @Override
    public Integer del(WaybillInfo waybillInfo) {
        return waybillInfoMapper.delete(waybillInfo);
    }

    @Override
    public Integer upd(WaybillInfo waybillInfo) {
        return waybillInfoMapper.updateByPrimaryKey(waybillInfo);
    }

    @Override
    public PageInfo<WaybillInfo> getWayBillInfo(Integer page,Integer limit,WaybillInfo waybillInfo,String type,String number) {

        if (type!=null){
            if ( type.equals("waybillNumber")) { waybillInfo.setWaybillNumber(number); }
            else if(type.equals("trackingNumber")){waybillInfo.setTrackingNumber(number);}
            else if(type.equals("wayId")){waybillInfo.setWayId(number);}
            else if(type.equals("participationNumber")){waybillInfo.setParticipationNumber(number);}
        }
        System.out.println(waybillInfo);
        PageHelper.startPage(page, limit);
        List<WaybillInfo> list=orderMapper.getWayBillInfo(waybillInfo);
        return new PageInfo<WaybillInfo>(list);
    }
}
