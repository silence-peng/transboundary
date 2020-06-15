package com.daji.service.impl;


import com.daji.mapper.OrderMapper;
import com.daji.mapper.WaybillInfoMapper;
import com.daji.pojo.TrackInfo;
import com.daji.pojo.User;
import com.daji.pojo.WaybillInfo;
import com.daji.service.TrackInfoService;
import com.daji.service.WaybillInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WaybillInfoServiceImpl implements WaybillInfoService {
    @Autowired
    private WaybillInfoMapper waybillInfoMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private TrackInfoService trackInfoService;
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
        return waybillInfoMapper.updateByPrimaryKeySelective(waybillInfo);
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

    public PageInfo<WaybillInfo> getWaybill(WaybillInfo waybillInfo,Integer page,Integer limit) {
        PageHelper.startPage(page,limit);
        List<WaybillInfo> waybillInfoList = waybillInfoMapper.getWaybill(waybillInfo);
        PageInfo<WaybillInfo> pageInfo = new PageInfo<WaybillInfo>(waybillInfoList);
        return pageInfo;
    }

    @Override
    public Integer up(WaybillInfo waybillInfo, User user) {
        TrackInfo trackInfo = new TrackInfo();
        trackInfo.setWaybillNumber(waybillInfo.getWaybillNumber());
        trackInfo.setReachTime(new Date());
        trackInfo.setSite("ISTANBUL-"+user.getAffiliatedBranches());
        trackInfo.setTrackRecord("快件已被"+user.getAffiliatedBranches()+"收货");
        trackInfo.setTrackStatus("收货");
        trackInfo.setOperator(user.getUserName());
        trackInfo.setOperate("自动追踪");
        trackInfo.setCreatedate(new Date());
        int result = trackInfoService.add(trackInfo);
        waybillInfo.setOrderStatus(19);
        return waybillInfoMapper.updateByPrimaryKeySelective(waybillInfo);
    }
}
