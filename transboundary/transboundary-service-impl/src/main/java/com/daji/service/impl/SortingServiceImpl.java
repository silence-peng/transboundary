package com.daji.service.impl;

import com.daji.mapper.SortingMapper;
import com.daji.pojo.Sorting;
import com.daji.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortingServiceImpl implements SortingService {

    @Autowired
   private SortingMapper sortingMapper;

    @Override
    public List<Sorting> getAll() {
        return sortingMapper.selectAll();
    }

    @Override
    public List<Sorting> getData(Sorting sorting) {
        if("".equals(sorting.getCustomer())){
            sorting.setCustomer(null);
        }
        if("".equals(sorting.getChineseDes())){
            sorting.setChineseDes(null);
        }
        if("".equals(sorting.getShipRoute())){
            sorting.setShipRoute(null);
        }
        if("".equals(sorting.getCargoTypeId())){
            sorting.setCargoTypeId(null);
        }
        if("".equals(sorting.getIsStartUsing())){
            sorting.setIsStartUsing(null);
        }
        return sortingMapper.select(sorting);
    }

    @Override
    public Sorting getOne(Sorting sorting) {
        return sortingMapper.selectOne(sorting);
    }

    @Override
    public Integer add(Sorting sorting) {
        return sortingMapper.insert(sorting);
    }

    @Override
    public Integer del(Sorting sorting) {
        return sortingMapper.delete(sorting);
    }

    @Override
    public Integer upd(Sorting sorting) {
        return sortingMapper.updateByPrimaryKey(sorting);
    }
}
