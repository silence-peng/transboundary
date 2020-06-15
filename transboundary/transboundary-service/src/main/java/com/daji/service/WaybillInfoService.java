package com.daji.service;

import com.daji.pojo.User;
import com.daji.pojo.WaybillInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface WaybillInfoService extends DataService<WaybillInfo> {
    PageInfo<WaybillInfo> getWayBillInfo(Integer page,Integer limit,WaybillInfo waybillInfo,String type,String number);
    PageInfo<WaybillInfo> getWaybill(WaybillInfo waybillInfo,Integer page,Integer limit);
    Integer up(WaybillInfo waybillInfo, User user);
}
