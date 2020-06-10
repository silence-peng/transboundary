package com.daji.web.baseController.py;

import com.daji.pojo.*;
import com.daji.service.*;
import com.daji.util.ResultMap;
import com.github.pagehelper.PageInfo;
import net.sf.jsqlparser.statement.select.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("transboundaryV5")
public class OrderController {
    @Autowired
    private AssignRouteService assignRouteService;
    @Autowired
    private WaybillInfoService waybillInfoService;
    @Autowired
    private OrderStateInfoService orderStateInfoService;
    @Autowired
    private BoycottGoodsInfoService boycottGoodsInfoService;
    @Autowired
    private PlaySingleInfoService playSingleInfoService;
    @Autowired
    private TwoSidesInfoService twoSidesInfoService;
    @Autowired
    private BaggingDistributionInfoService baggingDistributionInfoService;
    @RequestMapping("/order/loadAssignRouteList")
    public ResultMap<List<AssignRoute>> loadAssignRouteList(){
        List<AssignRoute> list=assignRouteService.getAll();
        return new ResultMap<List<AssignRoute>>("",list,0,list.size());
    }

    /**
     * 订单状态
     * @return
     */
    @RequestMapping("/order/loadOrderStatusInfoSelect")
    public List<OrderStateInfo> loadOrderStatusInfoSelect(){
        return orderStateInfoService.getAll();
    }

    /**
     * 排货
     * @return
     */
    @RequestMapping("/order/loadBoycottGoodsInfoList")
    public List<BoycottGoodsInfo> loadBoycottGoodsInfo(){
        return boycottGoodsInfoService.getAll();
    }

    /**
     * 袋号
     * @return
     */
    @RequestMapping("/order/loadBaggingDistributionInfo")
    public List<BaggingDistributionInfo> loadBaggingDistributionInfo(){
        return baggingDistributionInfoService.getAll();
    }

    /**
     * 打单
     * @return
     */
    @RequestMapping("/order/loadPlaySingleInfo")
    public List<PlaySingleInfo> loadPlaySingleInfo(){
        return playSingleInfoService.getAll();
    }
    /**
     * 寄件收件人信息表
     * @return
     */
    @RequestMapping("/order/loadTwoSidesInfo")
    public List<TwoSidesInfo> loadTwoSidesInfo(){
        return twoSidesInfoService.getAll();
    }

    /**
     * 加载运单列表
     * @param page
     * @param limit
     * @param waybillInfo
     * @param type
     * @param number
     * @return
     */
    @RequestMapping("/order/loadWayBillInfo")
    public ResultMap<List<WaybillInfo>> loadWayBillInfo(Integer page,String startDate,String endDate,Integer limit,WaybillInfo waybillInfo,String type,String number) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (startDate!=null && endDate!=null &&startDate!="" && endDate!="" ){
            System.out.println(startDate);
            System.out.println(endDate);
            waybillInfo.setOrderDate(dateFormat.parse(startDate));
            waybillInfo.setCretedate(dateFormat.parse(endDate));
        }
        PageInfo<WaybillInfo> pageInfo =waybillInfoService.getWayBillInfo(page, limit,waybillInfo,type,number);
        return new ResultMap<List<WaybillInfo>>("",pageInfo.getList(),0,pageInfo.getTotal());
    }

}
