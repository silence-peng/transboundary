package com.daji.service.impl;

import com.daji.mapper.LanguageMapper;
import com.daji.pojo.Language;
import com.daji.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService
{
    @Autowired
    private LanguageMapper languageMapper;
    @Override
    public List<Language> getAll() {
        return languageMapper.selectAll();
    }

    @Override
    public List<Language> getData(Language language) {
        return languageMapper.select(language);
    }

    @Override
    public Language getOne(Language language) {
        return languageMapper.selectByPrimaryKey(language);
    }

    @Override
    public Integer add(Language language) {
        return languageMapper.insert(language);
    }

    @Override
    public Integer del(Language language) {
        return languageMapper.delete(language);
    }

    @Override
    public Integer upd(Language language) {
        return languageMapper.updateByPrimaryKey(language);
    }
}
