package com.daji.web.baseController.zzw;

import com.daji.pojo.BoycottGoods;
import com.daji.pojo.User;
import com.daji.service.BoycottGoodsService;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("boycottGoods")
public class BoycottGoodsController {
    @Autowired
    private BoycottGoodsService boycottGoodsService;


    @RequestMapping("findBoycottGoods")
    public ResultMap<List<BoycottGoods>> findBoycottGoods(BoycottGoods boycottGoods){
        List<BoycottGoods> boycottGoodsList = boycottGoodsService.getData(boycottGoods);
        return new ResultMap<List<BoycottGoods>>("", boycottGoodsList, 0,boycottGoodsList.size());
    }
    @RequestMapping("addBoycottGoods")
    public boolean addBoycottGoods(BoycottGoods boycottGoods){
        int result = boycottGoodsService.add(boycottGoods);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("delBoycottGoods")
    public boolean delBoycottGoods(Integer id){
        BoycottGoods boycottGoods=new BoycottGoods();
        boycottGoods.setId(id);
        int result = boycottGoodsService.del(boycottGoods);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("updBoycottGoods")
    public boolean updBoycottGoods(BoycottGoods boycottGoods, HttpSession session){
        User admin = (User) session.getAttribute("admin");
        boycottGoods.setAlterDate(new Date());
        boycottGoods.setAlterPerson(admin.getUserName());
        int result= boycottGoodsService.upd(boycottGoods);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }

}
