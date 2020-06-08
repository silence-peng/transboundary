package com.daji.service.impl;

import com.daji.mapper.UserMapper;
import com.daji.mapper.VerigyTypeMapper;
import com.daji.pojo.User;
import com.daji.pojo.VerifyType;
import com.daji.service.UserService;
import com.daji.service.VerigyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerigyTypeServiceImpl implements VerigyTypeService {

    @Autowired
    private VerigyTypeMapper verigyTypeMapper;

    @Override
    public List<VerifyType> getAll() {
        return verigyTypeMapper.selectAll();
    }

    @Override
    public List<VerifyType> getData(VerifyType verifyType) {
        return verigyTypeMapper.select(verifyType);
    }

    @Override
    public VerifyType getOne(VerifyType verifyType) {
        return verigyTypeMapper.selectOne(verifyType);
    }

    @Override
    public Integer add(VerifyType verifyType) {
        return verigyTypeMapper.insert(verifyType);
    }

    @Override
    public Integer del(VerifyType verifyType) {
        return verigyTypeMapper.delete(verifyType);
    }

    @Override
    public Integer upd(VerifyType verifyType) {
        return verigyTypeMapper.updateByPrimaryKey(verifyType);
    }
}
