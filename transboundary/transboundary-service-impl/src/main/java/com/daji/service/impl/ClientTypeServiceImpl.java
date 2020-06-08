package com.daji.service.impl;

import com.daji.mapper.ClientTypeMapper;
import com.daji.pojo.ClientType;
import com.daji.service.ClientTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientTypeServiceImpl implements ClientTypeService {
    @Autowired
    private ClientTypeMapper clientTypeMapper;

    @Override
    public List<ClientType> getAll() {
        return clientTypeMapper.selectAll();
    }

    @Override
    public List<ClientType> getData(ClientType clientType) {
        return clientTypeMapper.select(clientType);
    }

    @Override
    public ClientType getOne(ClientType clientType) {
        return clientTypeMapper.selectByPrimaryKey(clientType);
    }

    @Override
    public Integer add(ClientType clientType) {
        return clientTypeMapper.insert(clientType);
    }

    @Override
    public Integer del(ClientType clientType) {
        return clientTypeMapper.delete(clientType);
    }

    @Override
    public Integer upd(ClientType clientType) {
        return clientTypeMapper.updateByPrimaryKey(clientType);
    }
}
