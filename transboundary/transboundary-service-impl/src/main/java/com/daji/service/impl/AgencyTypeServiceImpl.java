package com.daji.service.impl;

import com.daji.mapper.AgencyBasicInfoMapper;
import com.daji.mapper.AgencyTypeMapper;
import com.daji.pojo.AgencyType;
import com.daji.service.AgencyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyTypeServiceImpl implements AgencyTypeService {

    @Autowired
    private AgencyTypeMapper agencyTypeMapper;

    @Override
    public List<AgencyType> getAll() {
        return agencyTypeMapper.selectAll();
    }

    @Override
    public List<AgencyType> getData(AgencyType agencyType) {
        return agencyTypeMapper.select(agencyType);
    }

    @Override
    public AgencyType getOne(AgencyType agencyType) {
        return agencyTypeMapper.selectByPrimaryKey(agencyType);
    }

    @Override
    public Integer add(AgencyType agencyType) {
        return agencyTypeMapper.insert(agencyType);
    }

    @Override
    public Integer del(AgencyType agencyType) {
        return agencyTypeMapper.delete(agencyType);
    }

    @Override
    public Integer upd(AgencyType agencyType) {
        return agencyTypeMapper.updateByPrimaryKey(agencyType);
    }
}
