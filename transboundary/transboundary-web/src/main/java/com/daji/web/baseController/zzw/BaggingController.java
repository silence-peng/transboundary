package com.daji.web.baseController.zzw;

import com.daji.pojo.*;
import com.daji.service.*;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("bagging")
public class BaggingController {
    @Autowired
    private BaggingService baggingService;
    @Autowired
    private AssignRouteService assignRouteService;
    @Autowired
    private ShipmentRouteService shipmentRouteService;
    @Autowired
    private BranchBasicsInfoService branchBasicsInfoService;
    @Autowired
    private SharingModeService sharingModeService;
    @Autowired
    private CustomsClearanceInfoService customsClearanceInfoService;
    @Autowired
    private CargoTypeInfoService cargoTypeInfoService;

    @RequestMapping("findCargoType")
    public List<CargoTypeInfo> findCargoType(){
        List<CargoTypeInfo> cargoTypeInfoList = cargoTypeInfoService.getAll();
        return cargoTypeInfoList;
    }
    @RequestMapping("findCustomsClearance")
    public List<CustomsClearanceInfo> findCustoms(){
        List<CustomsClearanceInfo> customsClearanceInfoList = customsClearanceInfoService.getAll();
        return customsClearanceInfoList;
    }
    @RequestMapping("findSharingMode")
    public List<SharingMode> findSharingMode(){
        List<SharingMode> sharingModeList = sharingModeService.getAll();
        return sharingModeList;
    }
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
    }
    @RequestMapping("findBagging")
    public ResultMap<List<Bagging>> findBagging(Bagging bagging){
        List<Bagging> baggingList = baggingService.getData(bagging);
        return new ResultMap<List<Bagging>>("",baggingList, 0,baggingList.size());
    }
    @RequestMapping("findBaggingOne")
    public Bagging findBaggingOne(Bagging bagging){
        Bagging bagging1 = baggingService.getOne(bagging);
        return bagging1;
    }
    @RequestMapping("addBagging")
    public boolean addBagging(Bagging bagging, HttpSession session){
//        User admin = (User) session.getAttribute("admin");
//        bagging.setCreatePerson(admin.getUserName());
        bagging.setCreateDate(new Date());
        int result = baggingService.add(bagging);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("delBagging")
    public boolean delBagging(Integer id){
        Bagging bagging = new Bagging();
        bagging.setId(id);
        int result = baggingService.del(bagging);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("updBagging")
    public boolean updBagging(Bagging bagging, HttpSession session){
//        User admin = (User) session.getAttribute("admin");
//        bagging.setAlterPerson(admin.getUserName());
        bagging.setAlterDate(new Date());
        int result= baggingService.upd(bagging);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
}
