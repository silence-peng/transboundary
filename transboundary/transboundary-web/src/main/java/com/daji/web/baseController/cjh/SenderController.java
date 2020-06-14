package com.daji.web.baseController.cjh;

import com.daji.pojo.CustomerGroup;
import com.daji.pojo.Sender;
import com.daji.service.SenderService;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("Sender")
public class SenderController {
    @Autowired
    private SenderService senderService;

    @RequestMapping("findsender")
    public ResultMap<List<Sender>> fin(Sender sender){
        List<Sender> senders=senderService.getData(sender);
        return new ResultMap<List<Sender>>("",senders,0,senders.size());
    }

    @RequestMapping("add")
    public boolean add(Sender sender){
        sender.setCreateDate(new Date());
        int result=senderService.add(sender);
        if(result>0){
            return true;
        }
        return false;
    }

    @RequestMapping("update")
    public boolean upd(Sender sender){
        int result=senderService.upd(sender);
        if(result>0){
            return true;
        }
        return false;
    }
    @RequestMapping("del")
    public boolean del(Sender sender){

        int result=senderService.del(sender);
        if(result>0){
            return true;
        }
        return false;
    }

    @RequestMapping("get")
    public Sender findstination(Sender sender){

        Sender senders = senderService.getOne(sender);
        return senders;
    }
}
