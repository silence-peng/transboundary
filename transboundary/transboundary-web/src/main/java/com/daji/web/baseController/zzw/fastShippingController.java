package com.daji.web.baseController.zzw;

import com.daji.pojo.*;
import com.daji.service.*;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("fastShipping")
public class fastShippingController {
    @Autowired
    private WaybillInfoService waybillInfoService;
    @Autowired
    private CargoInfoService cargoInfoService;
    @Autowired
    private CustomerManagementService customerManagementService;
    @Autowired
    private CargoTypeInfoService cargoTypeInfoService;
    @Autowired
    private AssignRouteService assignRouteService;
    @Autowired
    private CountryService countryService;

    @RequestMapping("findWaybillOne")
    public WaybillInfo findWaybillOne(WaybillInfo waybillInfo){
        return waybillInfoService.getOne(waybillInfo);
    }
    @RequestMapping("findCountry")
    public List<Country> findCountry(Country country){
        return countryService.getData(country);
    }
    @RequestMapping("findfastShipping")
    public ResultMap<List<WaybillInfo>> findfastShipping(WaybillInfo waybillInfo){
        List<WaybillInfo> waybillInfoList = waybillInfoService.getData(waybillInfo);
        return new ResultMap<List<WaybillInfo>>("", waybillInfoList, 0,waybillInfoList.size());
    }
    @RequestMapping("findCargoInfo")
    public List<CargoInfo> findCargoInfo(CargoInfo cargoInfo){
        return cargoInfoService.getData(cargoInfo);
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
    @RequestMapping("findCargoType")
    public List<CargoTypeInfo> findCargoType(){
        List<CargoTypeInfo> cargoTypeInfoList = cargoTypeInfoService.getAll();
        return cargoTypeInfoList;
    }
}
