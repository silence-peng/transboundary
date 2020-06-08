package com.daji.service.impl;

import com.daji.mapper.NoteTypeMapper;
import com.daji.pojo.NoteType;
import com.daji.service.NoteTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.channels.NotYetBoundException;
import java.util.List;

@Service
public class NoteTypeServiceImpl implements NoteTypeService {
    @Autowired
    private NoteTypeMapper noteTypeMapper;
    @Override
    public List<NoteType> getAll() {
        return noteTypeMapper.selectAll();
    }

    @Override
    public List<NoteType> getData(NoteType noteType) {
        return noteTypeMapper.select(noteType);
    }

    @Override
    public NoteType getOne(NoteType noteType) {
        return noteTypeMapper.selectByPrimaryKey(noteType);
    }

    @Override
    public Integer add(NoteType noteType) {
        return noteTypeMapper.insert(noteType);
    }

    @Override
    public Integer del(NoteType noteType) {
        return noteTypeMapper.delete(noteType);
    }

    @Override
    public Integer upd(NoteType noteType) {
        return noteTypeMapper.updateByPrimaryKey(noteType);
    }
}
