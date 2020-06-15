package com.daji.web.baseController.cjh;

import com.daji.pojo.CargoInfo;
import com.daji.pojo.PayInfo;
import com.daji.pojo.WaybillInfo;
import com.daji.service.CargoInfoService;
import com.daji.service.PayInfoService;
import com.daji.service.WaybillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("WaybillInfoController")
public class WaybillInfoController {

    @Autowired
    private WaybillInfoService waybillInfoService;

    @Autowired
    private CargoInfoService cargoInfoService;

    @Autowired
    private PayInfoService payInfoService;

   @RequestMapping("addwaybill")
    public boolean addwaybill(WaybillInfo waybillInfo){
       int result=waybillInfoService.add(waybillInfo);
       if(result>0){
           return true;
       }
       return false;
   }

   @RequestMapping("addcargoInfo")
    public  boolean addcargo(CargoInfo cargoInfo){
       int result=cargoInfoService.add(cargoInfo);
       if(result>0){
           return true;
       }
       return false;
   }

   @RequestMapping("addpayinfo")
    public boolean addpayinfo(PayInfo payInfo){
       int result=payInfoService.add(payInfo);
       if(result>0){
           return true;
       }
       return false;
   }
}
