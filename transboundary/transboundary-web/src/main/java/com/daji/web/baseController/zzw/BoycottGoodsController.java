package com.daji.web.baseController.zzw;

import com.daji.pojo.*;
import com.daji.service.AssignRouteService;
import com.daji.service.BoycottGoodsService;
import com.daji.service.BranchBasicsInfoService;
import com.daji.service.ShipmentRouteService;
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
    @Autowired
    private AssignRouteService assignRouteService;
    @Autowired
    private ShipmentRouteService shipmentRouteService;
    @Autowired
    private BranchBasicsInfoService branchBasicsInfoService;

    @RequestMapping("findAssRoute")
    public List<AssignRoute> findAssRoute(){
        List<AssignRoute> assignRouteList = assignRouteService.getAll();
        return assignRouteList;
    }
    @RequestMapping("findshipRoute")
    public List<ShipmentRoute> findshipRoute(){
        List<ShipmentRoute> shipmentRouteList = shipmentRouteService.getAll();
        return shipmentRouteList;
    }
    @RequestMapping("findBranch")
    public List<BranchBasicsInfo> findBranch(){
        List<BranchBasicsInfo> branchBasicsInfoList = branchBasicsInfoService.getAll();
        return branchBasicsInfoList;
    }@RequestMapping("findBoycottGoods")
    public ResultMap<List<BoycottGoods>> findBoycottGoods(BoycottGoods boycottGoods){
        List<BoycottGoods> boycottGoodsList = boycottGoodsService.getData(boycottGoods);
        return new ResultMap<List<BoycottGoods>>("", boycottGoodsList, 0,boycottGoodsList.size());
    }
    @RequestMapping("findBoycottGoodsOne")
    public BoycottGoods findBoycottGoodsOne(BoycottGoods boycottGoods){
        BoycottGoods boycottGoods1 = boycottGoodsService.getOne(boycottGoods);
        return boycottGoods1;
    }
    @RequestMapping("addBoycottGoods")
    public boolean addBoycottGoods(BoycottGoods boycottGoods,HttpSession session){
        User admin = (User) session.getAttribute("admin");
        boycottGoods.setCreatePerson(admin.getUserName());
        boycottGoods.setCreateDate(new Date());
        int result = boycottGoodsService.add(boycottGoods);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("delBoycottGoods")
    public boolean delBoycottGoods(Integer id){
        BoycottGoods boycottGoods = new BoycottGoods();
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
