package com.daji.service.impl;

import com.daji.mapper.AgencyBasicInfoMapper;
import com.daji.pojo.AgencyBasicInfo;
import com.daji.service.AgencyBasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyBasicInfoServiceImpl implements AgencyBasicInfoService {

    @Autowired
    private AgencyBasicInfoMapper agencyBasicInfoMapper;

    @Override
    public List<AgencyBasicInfo> getAll() {
        return agencyBasicInfoMapper.selectAll();
    }

    @Override
    public List<AgencyBasicInfo> getData(AgencyBasicInfo agencyBasicInfo) {
        return agencyBasicInfoMapper.select(agencyBasicInfo);
    }

    @Override
    public AgencyBasicInfo getOne(AgencyBasicInfo agencyBasicInfo) {
        return agencyBasicInfoMapper.selectByPrimaryKey(agencyBasicInfo);
    }

    @Override
    public Integer add(AgencyBasicInfo agencyBasicInfo) {
        return agencyBasicInfoMapper.insert(agencyBasicInfo);
    }

    @Override
    public Integer del(AgencyBasicInfo agencyBasicInfo) {
        return agencyBasicInfoMapper.delete(agencyBasicInfo);
    }

    @Override
    public Integer upd(AgencyBasicInfo agencyBasicInfo) {
        return agencyBasicInfoMapper.updateByPrimaryKey(agencyBasicInfo);
    }
}
