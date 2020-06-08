package com.daji.service.impl;

import com.daji.mapper.UpdateLogInfoMapper;
import com.daji.pojo.UpdateLogInfo;
import com.daji.service.UpdateLogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpdateLogInfoServiceImpl implements UpdateLogInfoService {
    @Autowired
    private UpdateLogInfoMapper updateLogInfoMapper;
    @Override
    public List<UpdateLogInfo> getAll() {
        return updateLogInfoMapper.selectAll();
    }

    @Override
    public List<UpdateLogInfo> getData(UpdateLogInfo updateLogInfo) {
        return updateLogInfoMapper.select(updateLogInfo);
    }

    @Override
    public UpdateLogInfo getOne(UpdateLogInfo updateLogInfo) {
        return updateLogInfoMapper.selectOne(updateLogInfo);
    }

    @Override
    public Integer add(UpdateLogInfo updateLogInfo) {
        return updateLogInfoMapper.insert(updateLogInfo);
    }

    @Override
    public Integer del(UpdateLogInfo updateLogInfo) {
        return updateLogInfoMapper.delete(updateLogInfo);
    }

    @Override
    public Integer upd(UpdateLogInfo updateLogInfo) {
        return updateLogInfoMapper.updateByPrimaryKey(updateLogInfo);
    }
}
