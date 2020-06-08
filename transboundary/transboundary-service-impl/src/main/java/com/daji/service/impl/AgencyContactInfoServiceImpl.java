package com.daji.service.impl;

import com.daji.mapper.AgencyContactInfoMapper;
import com.daji.pojo.AgencyContactInfo;
import com.daji.service.AgencyContactInfoService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyContactInfoServiceImpl implements AgencyContactInfoService {

    @Autowired
    private AgencyContactInfoMapper agencyContactInfoMapper;

    @Override
    public List<AgencyContactInfo> getAll() {
        return agencyContactInfoMapper.selectAll();
    }

    @Override
    public List<AgencyContactInfo> getData(AgencyContactInfo agencyContactInfo) {
        return agencyContactInfoMapper.select(agencyContactInfo);
    }

    @Override
    public AgencyContactInfo getOne(AgencyContactInfo agencyContactInfo) {
        return agencyContactInfoMapper.selectByPrimaryKey(agencyContactInfo);
    }

    @Override
    public Integer add(AgencyContactInfo agencyContactInfo) {
        return agencyContactInfoMapper.insert(agencyContactInfo);
    }

    @Override
    public Integer del(AgencyContactInfo agencyContactInfo) {
        return agencyContactInfoMapper.delete(agencyContactInfo);
    }

    @Override
    public Integer upd(AgencyContactInfo agencyContactInfo) {
        return agencyContactInfoMapper.updateByPrimaryKey(agencyContactInfo);
    }
}
