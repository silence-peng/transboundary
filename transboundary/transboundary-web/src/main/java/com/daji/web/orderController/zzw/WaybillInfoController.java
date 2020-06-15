package com.daji.web.orderController.zzw;

import com.daji.pojo.OrderStateInfo;
import com.daji.pojo.User;
import com.daji.pojo.WaybillInfo;
import com.daji.service.OrderStateInfoService;
import com.daji.service.WaybillInfoService;
import com.daji.util.ResultMap;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.swing.text.StyledEditorKit;
import java.util.List;

@RestController
@RequestMapping("waybill")
public class WaybillInfoController {
    @Autowired
    private WaybillInfoService waybillInfoService;
    @Autowired
    private OrderStateInfoService orderStateInfoService;

    @RequestMapping("findOrderState")
    public List<OrderStateInfo> findOrderState(){
        return orderStateInfoService.getAll();
    }
    @RequestMapping("findWaybill")
    public ResultMap<List<WaybillInfo>> findWaybill(WaybillInfo waybillInfo,Integer page,Integer limit){
        PageInfo<WaybillInfo> pageInfo = waybillInfoService.getWaybill(waybillInfo,page,limit);
        return new ResultMap<List<WaybillInfo>>("",pageInfo.getList(),0,pageInfo.getSize());
    }
    @RequestMapping("updWaybill")
    public boolean updWaybill(String [] wayId, HttpSession session){
        User user = (User) session.getAttribute("admin");
        int result=0;
        for (int i=0;i<wayId.length;i++){
            WaybillInfo waybillInfo = new WaybillInfo();
            waybillInfo.setWayId(wayId[i]);
            result= waybillInfoService.up(waybillInfo,user);
        }
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
}
