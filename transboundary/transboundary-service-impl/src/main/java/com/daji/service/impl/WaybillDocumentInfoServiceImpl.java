package com.daji.service.impl;

import com.daji.mapper.WaybillDocumentInfoMapper;
import com.daji.pojo.WaybillDocumentInfo;
import com.daji.service.WaybillDocumentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillDocumentInfoServiceImpl implements WaybillDocumentInfoService {
    @Autowired
    private WaybillDocumentInfoMapper waybillDocumentInfoMapper;
    @Override
    public List<WaybillDocumentInfo> getAll() {
        return waybillDocumentInfoMapper.selectAll();
    }

    @Override
    public List<WaybillDocumentInfo> getData(WaybillDocumentInfo waybillDocumentInfo) {
        return waybillDocumentInfoMapper.select(waybillDocumentInfo);
    }

    @Override
    public WaybillDocumentInfo getOne(WaybillDocumentInfo waybillDocumentInfo) {
        return waybillDocumentInfoMapper.selectOne(waybillDocumentInfo);
    }

    @Override
    public Integer add(WaybillDocumentInfo waybillDocumentInfo) {
        return waybillDocumentInfoMapper.insert(waybillDocumentInfo);
    }

    @Override
    public Integer del(WaybillDocumentInfo waybillDocumentInfo) {
        return waybillDocumentInfoMapper.delete(waybillDocumentInfo);
    }

    @Override
    public Integer upd(WaybillDocumentInfo waybillDocumentInfo) {
        return waybillDocumentInfoMapper.updateByPrimaryKey(waybillDocumentInfo);
    }
}
