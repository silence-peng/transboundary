package com.daji.service.impl;

import com.daji.mapper.NoteMapper;
import com.daji.pojo.Note;
import com.daji.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteMapper noteMapper;


    @Override
    public List<Note> getAll() {
        return noteMapper.selectAll();
    }

    @Override
    public List<Note> getData(Note note) {
        return noteMapper.select(note);
    }

    @Override
    public Note getOne(Note note) {
        return noteMapper.selectByPrimaryKey(note);
    }


    @Override
    public Integer add(Note note) {
        return noteMapper.insert(note);
    }

    @Override
    public Integer del(Note note) {
        return noteMapper.delete(note);
    }


    @Override
    public Integer upd(Note note) {
        return noteMapper.updateByPrimaryKey(note);
    }
}
