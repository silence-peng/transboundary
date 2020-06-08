package com.daji.service.impl;

import com.daji.mapper.PositionManagementMapper;
import com.daji.pojo.PositionManagement;
import com.daji.service.PositionManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PositionManagementServiceImpl implements PositionManagementService {
    @Autowired
    private PositionManagementMapper positionManagementMapper;
    @Override
    public List<PositionManagement> getAll() {
        return positionManagementMapper.selectAll();
    }

    @Override
    public List<PositionManagement> getData(PositionManagement positionManagement) {
        if (positionManagement.getPositionCoding()!=null&&positionManagement.getPositionCoding().equals("")){
            positionManagement.setPositionCoding(null);
        }
        return positionManagementMapper.select(positionManagement);
    }

    @Override
    public PositionManagement getOne(PositionManagement positionManagement) {
        return positionManagementMapper.selectByPrimaryKey(positionManagement);
    }

    @Override
    public Integer add(PositionManagement positionManagement) {
        positionManagement.setCreateDate(new Date());
        if (positionManagement.getIsStartUsing()==null){
            positionManagement.setIsStartUsing(0);
        }
        if (positionManagementMapper.selectByPrimaryKey(positionManagement)!=null){
            return 0;
        }
        return positionManagementMapper.insert(positionManagement);
    }

    @Override
    public Integer del(PositionManagement positionManagement) {
        return positionManagementMapper.delete(positionManagement);
    }

    @Override
    public Integer upd(PositionManagement positionManagement) {
        positionManagement.setAlterDate(new Date());
        return positionManagementMapper.updateByPrimaryKeySelective(positionManagement);
    }
}
