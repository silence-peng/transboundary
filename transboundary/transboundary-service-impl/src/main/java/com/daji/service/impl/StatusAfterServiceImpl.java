package com.daji.service.impl;

import com.daji.mapper.SortingMapper;
import com.daji.mapper.StatusAfterMapper;
import com.daji.pojo.Sorting;
import com.daji.pojo.StatusAfter;
import com.daji.service.SortingService;
import com.daji.service.StatusAfterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusAfterServiceImpl implements StatusAfterService {

    @Autowired
   private StatusAfterMapper statusAfterMapper;

    @Override
    public List<StatusAfter> getAll() {
        return statusAfterMapper.selectAll();
    }

    @Override
    public List<StatusAfter> getData(StatusAfter statusAfter) {
        return statusAfterMapper.select(statusAfter);
    }

    @Override
    public StatusAfter getOne(StatusAfter statusAfter) {
        return statusAfterMapper.selectOne(statusAfter);
    }

    @Override
    public Integer add(StatusAfter statusAfter) {
        return statusAfterMapper.insert(statusAfter);
    }

    @Override
    public Integer del(StatusAfter statusAfter) {
        return statusAfterMapper.delete(statusAfter);
    }

    @Override
    public Integer upd(StatusAfter statusAfter) {
        return statusAfterMapper.updateByPrimaryKey(statusAfter);
    }
}
