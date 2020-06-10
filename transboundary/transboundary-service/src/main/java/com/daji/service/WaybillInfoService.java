package com.daji.service;

import com.daji.pojo.WaybillInfo;
import com.github.pagehelper.PageInfo;

public interface WaybillInfoService extends DataService<WaybillInfo> {
    PageInfo<WaybillInfo> getWayBillInfo(Integer page,Integer limit,WaybillInfo waybillInfo,String type,String number);
}
