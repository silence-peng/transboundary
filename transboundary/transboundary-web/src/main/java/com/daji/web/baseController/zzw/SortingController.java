package com.daji.web.baseController.zzw;

import com.daji.pojo.*;
import com.daji.service.*;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sorting")
public class SortingController {
    @Autowired
    private SortingService sortingService;
    @Autowired
    private AssignRouteService assignRouteService;
    @Autowired
    private ShipmentRouteService shipmentRouteService;
    @Autowired
    private BranchBasicsInfoService branchBasicsInfoService;
    @Autowired
    private CustomsClearanceInfoService customsClearanceInfoService;
    @Autowired
    private CustomerManagementService customerManagementService;


    @RequestMapping("findCustomsClearance")
    public List<CustomsClearanceInfo> findCustoms(){
        List<CustomsClearanceInfo> customsClearanceInfoList = customsClearanceInfoService.getAll();
        return customsClearanceInfoList;
    }
    @RequestMapping("findCustomer")
    public List<CustomerManagement> findCustomerManagement(){
        List<CustomerManagement> customerManagementList = customerManagementService.getAll();
        return customerManagementList;
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
    @RequestMapping("findSorting")
    public ResultMap<List<Sorting>> findSorting(Sorting sorting){
        List<Sorting> sortingList = sortingService.getData(sorting);
        return new ResultMap<List<Sorting>>("", sortingList, 0,sortingList.size());
    }
    @RequestMapping("findSortingOne")
    public Sorting findSortingOne(Sorting sorting){
        Sorting sorting1 = sortingService.getOne(sorting);
        return sorting1;
    }
    @RequestMapping("addSorting")
    public boolean addSorting(Sorting sorting){
        int result = sortingService.add(sorting);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("delSorting")
    public boolean delSorting(Integer id){
        Sorting sorting = new Sorting();
        sorting.setId(id);
        int result = sortingService.del(sorting);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("updSorting")
    public boolean updSorting(Sorting sorting){
        int result= sortingService.upd(sorting);
        if (result>0){
            return true;
        }else {
            return false;
        }
    }
}
