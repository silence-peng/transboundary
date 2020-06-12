package com.daji.web.baseController.py;


import com.daji.pojo.BranchBasicsInfo;
import com.daji.pojo.CustomerManagement;
import com.daji.pojo.ImportTemplateInfo;
import com.daji.pojo.PositionManagement;
import com.daji.service.BranchBasicsInfoService;
import com.daji.service.CustomerManagementService;
import com.daji.service.ImportTemplateInfoService;
import com.daji.service.PositionManagementService;
import com.daji.service.impl.OrderExportServiceImpl;
import com.daji.util.ResultMap;
import com.daji.util.XslxUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/transboundaryV5")
public class BaseController {
    @Autowired
    private PositionManagementService positionManagementService;
    @Autowired
    private BranchBasicsInfoService branchBasicsInfoService;
    @Autowired
    private CustomerManagementService customerManagementService;
    @Autowired
    private ImportTemplateInfoService importTemplateInfoService;
    @Autowired
    private OrderExportServiceImpl orderExportService;
    @RequestMapping("/base/loadPositionManagment")
    public ResultMap<List<PositionManagement>> loadPositionManagment(PositionManagement positionManagement){
        List<PositionManagement> list=positionManagementService.getData(positionManagement);
        return new ResultMap<List<PositionManagement>>("", list, 0,list.size());
    }
    @RequestMapping("/base/loadBranchBasicsInfo")
    public List<BranchBasicsInfo> loadBranchBasicsInfo( ){
        return branchBasicsInfoService.getAll();
    }
    @RequestMapping("/order/loadCustomerManagement")
    public List<CustomerManagement> loadCustomerManagement( ){
        return customerManagementService.getAll();
    }

    @RequestMapping("/order/loadCustomerManagementList")
    public ResultMap<List<CustomerManagement>> loadCustomerManagementList( ){
        List<CustomerManagement> list=customerManagementService.getAll();
        return new ResultMap<List<CustomerManagement>>("",list,0,list.size());
    }

    @RequestMapping("/base/loadTemplateInfo")
    public List<ImportTemplateInfo> loadTemplateInfo( ){
        return importTemplateInfoService.getAll();
    }

    @RequestMapping("/base/addPositionManagment")
    public boolean addPositionManagment(PositionManagement positionManagement){
        return positionManagementService.add(positionManagement)>0;
    }
    @RequestMapping("/base/delPositionManagment")
    public boolean delPositionManagment(PositionManagement positionManagement){
        return positionManagementService.del(positionManagement)>0;
    }
    @RequestMapping("/base/updPositionManagment")
    public boolean updPositionManagment(PositionManagement positionManagement){
        return positionManagementService.upd(positionManagement)>0;
    }
    @RequestMapping("/base/getPositionManagment")
    public PositionManagement getPositionManagment( PositionManagement positionManagement){
        System.out.println(positionManagement);
        return positionManagementService.getOne(positionManagement);
    }

    @PostMapping("base/upload")
    public Object upload(@RequestParam("file") MultipartFile file,Integer templateId,String code) throws IOException {
        System.out.println(templateId+code);
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }else{
            orderExportService.exportFile(file.getInputStream());
        }
        String fileName = file.getOriginalFilename();
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("data", fileName);
        return map;
    }

}
