package com.daji.service.impl;

import com.daji.mapper.WaybillAttachmentInfoMapper;
import com.daji.pojo.WaybillAttachmentInfo;
import com.daji.service.WaybillAttachmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillAttachmentInfoServiceImpl implements WaybillAttachmentInfoService {
    @Autowired
    private WaybillAttachmentInfoMapper waybillAttachmentInfoMapper;
    @Override
    public List<WaybillAttachmentInfo> getAll() {
        return waybillAttachmentInfoMapper.selectAll();
    }

    @Override
    public List<WaybillAttachmentInfo> getData(WaybillAttachmentInfo waybillAttachmentInfo) {
        return waybillAttachmentInfoMapper.select(waybillAttachmentInfo);
    }

    @Override
    public WaybillAttachmentInfo getOne(WaybillAttachmentInfo waybillAttachmentInfo) {
        return waybillAttachmentInfoMapper.selectOne(waybillAttachmentInfo);
    }

    @Override
    public Integer add(WaybillAttachmentInfo waybillAttachmentInfo) {
        return waybillAttachmentInfoMapper.insert(waybillAttachmentInfo);
    }

    @Override
    public Integer del(WaybillAttachmentInfo waybillAttachmentInfo) {
        return waybillAttachmentInfoMapper.delete(waybillAttachmentInfo);
    }

    @Override
    public Integer upd(WaybillAttachmentInfo waybillAttachmentInfo) {
        return waybillAttachmentInfoMapper.updateByPrimaryKey(waybillAttachmentInfo);
    }
}
