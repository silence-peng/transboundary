package com.daji.service.impl;

import com.daji.mapper.EntrustOurCatalogueMapper;
import com.daji.pojo.EnglishDescriptionType;
import com.daji.pojo.EntrustOurCatalogue;
import com.daji.service.EntrustOurCatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EntrustOurCatalogueServiceImpl implements EntrustOurCatalogueService {
    @Autowired
    private EntrustOurCatalogueMapper entrustOurCatalogueMapper;

    @Override
    public List<EntrustOurCatalogue> getAll() {
        return entrustOurCatalogueMapper.selectAll();
    }

    @Override
    public List<EntrustOurCatalogue> getData(EntrustOurCatalogue entrustOurCatalogue) {
        return entrustOurCatalogueMapper.select(entrustOurCatalogue);
    }

    @Override
    public EntrustOurCatalogue getOne(EntrustOurCatalogue entrustOurCatalogue) {
        return entrustOurCatalogueMapper.selectOne(entrustOurCatalogue);
    }

    @Override
    public Integer add(EntrustOurCatalogue entrustOurCatalogue) {
        return entrustOurCatalogueMapper.insert(entrustOurCatalogue);
    }

    @Override
    public Integer del(EntrustOurCatalogue entrustOurCatalogue) {
        return entrustOurCatalogueMapper.delete(entrustOurCatalogue);
    }

    @Override
    public Integer upd(EntrustOurCatalogue entrustOurCatalogue) {
        return entrustOurCatalogueMapper.updateByPrimaryKey(entrustOurCatalogue);
    }
}
