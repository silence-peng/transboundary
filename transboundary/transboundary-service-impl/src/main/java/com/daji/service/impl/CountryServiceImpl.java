package com.daji.service.impl;

import com.daji.mapper.CountryMapper;
import com.daji.pojo.Country;
import com.daji.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<Country> getAll() {
        return countryMapper.selectAll();
    }

    @Override
    public List<Country> getData(Country country) {
        return countryMapper.select(country);
    }

    @Override
    public Country getOne(Country country) {
        return countryMapper.selectByPrimaryKey(country);
    }

    @Override
    public Integer add(Country country) {
        return countryMapper.insert(country);
    }

    @Override
    public Integer del(Country country) {
        return countryMapper.delete(country);
    }

    @Override
    public Integer upd(Country country) {
        return countryMapper.updateByPrimaryKey(country);
    }
}
