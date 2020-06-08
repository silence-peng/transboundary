package com.daji.service.impl;

import com.daji.pojo.CargoInfo;
import com.daji.pojo.ChildOrdersInfo;
import com.daji.pojo.TemplateLogInfo;
import com.daji.pojo.WaybillInfo;
import com.daji.service.*;
import com.daji.util.XslxUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

@Service
public class OrderExportServiceImpl {
    @Autowired
    private TemplateLogInfoService templateLogInfoService;
    @Autowired
    private WaybillInfoService waybillInfoService;
    @Autowired
    private ChildOrdersInfoService childOrdersInfoService;
    @Autowired
    private CargoInfoService cargoInfoService;
    @Autowired
    private TwoSidesInfoService twoSidesInfoService;
    public void exportFile(InputStream inputStream){
        WaybillInfo waybillInfo=new WaybillInfo();
        ChildOrdersInfo childOrdersInfo=new ChildOrdersInfo();
        CargoInfo cargoInfo=new CargoInfo();
        TemplateLogInfo templateLogInfo=new TemplateLogInfo();

        XslxUtil xslxUtil=new XslxUtil();
        List<List> list=xslxUtil.readXlsx(inputStream);
        List<String> nameList=list.get(0);
        for (int i=1;i<list.size();i++){
            List arr=list.get(i);
            for (int j=0;j<=10;j++){

            }
        }
    }
}
