package com.daji.service.impl;

import com.daji.mapper.NoteVariateMapper;
import com.daji.pojo.NoteVariate;
import com.daji.service.NoteVariateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteVariateServiceImpl implements NoteVariateService {
    @Autowired
    private NoteVariateMapper noteVariateMapper;
    @Override
    public List<NoteVariate> getAll() {
        return noteVariateMapper.selectAll();
    }

    @Override
    public List<NoteVariate> getData(NoteVariate noteVariate) {
        return noteVariateMapper.select(noteVariate);
    }

    @Override
    public NoteVariate getOne(NoteVariate noteVariate) {
        return noteVariateMapper.selectByPrimaryKey(noteVariate);
    }

    @Override
    public Integer add(NoteVariate noteVariate) {
        return noteVariateMapper.insert(noteVariate);
    }

    @Override
    public Integer del(NoteVariate noteVariate) {
        return noteVariateMapper.delete(noteVariate);
    }

    @Override
    public Integer upd(NoteVariate noteVariate) {
        return noteVariateMapper.updateByPrimaryKey(noteVariate);
    }
}
