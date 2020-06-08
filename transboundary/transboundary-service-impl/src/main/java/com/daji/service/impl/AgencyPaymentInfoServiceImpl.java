package com.daji.service.impl;

import com.daji.mapper.AgencyPaymentInfoMapper;
import com.daji.pojo.AgencyPaymentInfo;
import com.daji.service.AgencyPaymentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyPaymentInfoServiceImpl implements AgencyPaymentInfoService {

    @Autowired
    private AgencyPaymentInfoMapper agencyPaymentInfoMapper;

    @Override
    public List<AgencyPaymentInfo> getAll() {
        return agencyPaymentInfoMapper.selectAll();
    }

    @Override
    public List<AgencyPaymentInfo> getData(AgencyPaymentInfo agencyPaymentInfo) {
        return agencyPaymentInfoMapper.select(agencyPaymentInfo);
    }

    @Override
    public AgencyPaymentInfo getOne(AgencyPaymentInfo agencyPaymentInfo) {
        return agencyPaymentInfoMapper.selectByPrimaryKey(agencyPaymentInfo);
    }

    @Override
    public Integer add(AgencyPaymentInfo agencyPaymentInfo) {
        return agencyPaymentInfoMapper.insert(agencyPaymentInfo);
    }

    @Override
    public Integer del(AgencyPaymentInfo agencyPaymentInfo) {
        return agencyPaymentInfoMapper.delete(agencyPaymentInfo);
    }

    @Override
    public Integer upd(AgencyPaymentInfo agencyPaymentInfo) {
        return agencyPaymentInfoMapper.updateByPrimaryKey(agencyPaymentInfo);
    }
}
