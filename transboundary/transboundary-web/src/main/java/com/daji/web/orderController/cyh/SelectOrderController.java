package com.daji.web.orderController.cyh;

import com.daji.pojo.*;
import com.daji.service.*;
import com.daji.util.ResultMap;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SelectOrderController {
    @Autowired
    private BranchBasicsInfoService branchBasicsInfoService;
    @Autowired
    private ClientTypeService clientTypeService;
    @Autowired
    private CustomerManagementService customerManagementService;
    @Autowired
    private BusinessTypeService businessTypeService;
    @Autowired
    private AssignRouteService assignRouteService;
    @Autowired
    private PackagingTypeService packagingTypeService;
    @Autowired
    private PaymentMethodInfoService paymentMethodInfoService;
    @Autowired
    private CargoTypeInfoService cargoTypeInfoService;
    @Autowired
    private DestinationManagementService destinationManagementService;
    @Autowired
    private ShipmentRouteService shipmentRouteService;
    @Autowired
    private RouteTypeService routeTypeService;
    @Autowired
    private CustomsClearanceInfoService customsClearanceInfoService;
    @Autowired
    private SelectOrderService selectOrderService;

    @RequestMapping("/selectOrderAll")
    public Object selectOrderAll(Integer limit ,Integer page,SelectOrderPatementer selectOrderPatementer){
        PageInfo<SelectOrder> pageInfo = selectOrderService.selectAll((page-1)*limit,limit,selectOrderPatementer);
        List<SelectOrder> list = pageInfo.getList();
        Integer size = Integer.parseInt(String.valueOf(pageInfo.getTotal()));
        ResultMap<List<SelectOrder>> resultMap = new ResultMap<List<SelectOrder>>("", list,0,size);
        return resultMap;
    }

    /**寄件网点
     *
     * @return
     */
    @RequestMapping("/selectBranchBasicsInfoAll")
    public Object selectBranchBasicsInfoAll(){
       List<BranchBasicsInfo> list = branchBasicsInfoService.getAll();
       return list;
    }

    /**
     * 客户类型
     * @return
     */
    @RequestMapping("/selectClientTypeAll")
    public Object selectClientTypeAll(){
        List<ClientType> list = clientTypeService.getAll();
        return list;
    }
    /**
     * 客户
     * @return
     */
    @RequestMapping("/selectCustomerManagementAll")
    public Object selectCustomerManagementAll(){
        List<CustomerManagement> list = customerManagementService.getAll();
        return list;
    }
    /**
     * 业务类型
     * @return
     */
    @RequestMapping("/selectBusinessTypeAll")
    public Object selectBusinessTypeAll(){
        List<BusinessType> list = businessTypeService.getAll();
        return list;
    }

    /**
     * 指定路线
     * @return
     */
    @RequestMapping("/selectAssignRouteAll")
    public Object selectAssignRouteAll(){
        List<AssignRoute> list = assignRouteService.getAll();
        return list;
    }

    /**
     * 包装类型
     * @return
     */
    @RequestMapping("/selectPackagingTypeAll")
    public Object selectPackagingTypeAll(){
        List<PackagingType> list = packagingTypeService.getAll();
        return list;
    }

    /**
     * 付款方式
     * @return
     */
    @RequestMapping("/selectPaymentMethodInfoAll")
    public Object selectPaymentMethodInfoAll(){
        List<PaymentMethodInfo> list = paymentMethodInfoService.getAll();
        return list;
    }
    /**
     * 货物类型
     * @return
     */
    @RequestMapping("/selectCargoTypeInfoAll")
    public Object selectCargoTypeInfoAll(){
        List<CargoTypeInfo> list = cargoTypeInfoService.getAll();
        return list;
    }
    /**
     * 目的地
     * @return
     */
    @RequestMapping("/selectDestinationManagementAll")
    public Object selectDestinationManagementAll(){
        List<DestinationManagement> list = destinationManagementService.getAll();
        return list;
    }
    /**
     * 走货路线
     * @return
     */
    @RequestMapping("/selectShipmentRouteAll")
    public Object selectShipmentRouteAll(){
        List<ShipmentRoute> list = shipmentRouteService.getAll();
        return list;
    }
    /**
     * 走货路线分类
     * @return
     */
    @RequestMapping("/selectRouteTypeAll")
    public Object selectRouteTypeAll(){
        List<RouteType> list = routeTypeService.getAll();
        return list;
    }
    /**
     * 报关方式
     * @return
     */
    @RequestMapping("/selectCustomsClearanceInfoAll")
    public Object selectCustomsClearanceInfoAll(){
        List<CustomsClearanceInfo> list = customsClearanceInfoService.getAll();
        return list;
    }


}
