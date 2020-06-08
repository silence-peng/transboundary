package com.daji.web.baseController.liujian;

import com.daji.pojo.Dept;
import com.daji.pojo.Note;
import com.daji.pojo.NoteType;
import com.daji.pojo.NoteVariate;
import com.daji.service.NoteService;
import com.daji.service.NoteTypeService;
import com.daji.service.NoteVariateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SmsSettingscontroller {
    @Autowired
    private NoteService noteService;
    @Autowired
    private NoteTypeService noteTypeService;
    @Autowired
    private NoteVariateService noteVariateService;
    @RequestMapping("qqq")
    public Object qweqw(){
        NoteVariate noteVariate=new NoteVariate();
        Note note=new Note();
        List<NoteVariate> listNoteVariate=noteVariateService.getData(noteVariate);
        Note note1= noteService.getOne(note);
        List<NoteType>listNoteType= noteTypeService.getAll();
        return listNoteType;
    }
}
