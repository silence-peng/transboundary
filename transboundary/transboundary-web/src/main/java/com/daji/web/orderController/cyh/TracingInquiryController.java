package com.daji.web.orderController.cyh;

import com.daji.pojo.*;
import com.daji.service.*;
import com.daji.util.ResultMap;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@RestController
public class TracingInquiryController {
    @Autowired
    private WaybillDocumentInfoService waybillDocumentInfoService;
    @Autowired
    private SelectOrderService selectOrderService;

    @Autowired
    private CustomerServiceInfoService customerServiceInfoService;

    @Autowired
    private TwoSidesInfoService twoSidesInfoService;

    @Autowired
    private TrackInfoService trackInfoService;
    @Autowired
    private ChildTrackInfoService childTrackInfoService;
    @Autowired
    private UpdateLogInfoService updateLogInfoService;
    @Autowired
    private ChildOrdersInfoService childOrdersInfoService;

    /**
     * 查询运单信息以及货物信息
     * @param selectOrderPatementer
     * @return
     */
    @RequestMapping("/SelectOrderOne")
    public Object getOne(SelectOrderPatementer selectOrderPatementer){
       SelectOrder selectOrder = selectOrderService.selectOne(selectOrderPatementer);
       return selectOrder;
    }

    /**
     * 客户服务信息
     * @param waybillNumber
     * @return
     */
    @RequestMapping("/SelectCustomerServiceInfoByWaybillNumber")
    public Object SelectCustomerServiceInfoByWaybillNumber(String  waybillNumber){
        CustomerServiceInfo customerServiceInfo = customerServiceInfoService.getOne(new CustomerServiceInfo().setWaybillNumber(waybillNumber));

        return customerServiceInfo;
    }

    /**
     * 寄件人收件
     * @param
     * @return
     */
    @RequestMapping("/SelecttwoSidesInfoServiceByWaybillNumber")
    public Object SelecttwoSidesInfoServiceByWaybillNumber(String waybillNumber,Integer typeId){
        TwoSidesInfo twoSidesInfo1 = twoSidesInfoService.getOne(new TwoSidesInfo().setWaybillNumber(waybillNumber).setTypeId(typeId));

        return twoSidesInfo1;
    }

    /**
     * 追踪信息
     * @param waybillNumber
     * @return
     */
    @RequestMapping("/SelectTrackInfoByWaybillNumber")
    public Object SelectTrackInfoServiceByWaybillNumber(String waybillNumber){
        List<TrackInfo> list = trackInfoService.getData(new TrackInfo().setWaybillNumber(waybillNumber));
        Collections.sort(list, new Comparator<TrackInfo>(){
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            public int compare(TrackInfo o1, TrackInfo o2) {
                return (o2.getCreatedate().toString()).compareTo(o1.getCreatedate().toString());
            }
        });
        for (int i=1;i<=list.size();i++){
            list.get(i-1).setId(i);
        }


        ResultMap<List<TrackInfo>> resultMap =new ResultMap<List<TrackInfo>>("",list,0,list.size());
        return resultMap;
    }


    /**
     * 子单追踪信息
     * @param waybillNumber
     * @return
     */
    @RequestMapping("/SelectChildTrackInfoByWaybillNumber")
    public Object SelectChildTrackInfoByWaybillNumber(String waybillNumber){
       List<ChildTrackInfo> list = childTrackInfoService.getData(new ChildTrackInfo().setWaybillNumber(waybillNumber));

        Collections.sort(list, new Comparator<ChildTrackInfo>(){
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            public int compare(ChildTrackInfo o1, ChildTrackInfo o2) {
                return (o2.getLatestTime().toString()).compareTo(o1.getLatestTime().toString());
            }
});
for (int i=1;i<=list.size();i++){
    list.get(i-1).setId(i);
}

       ResultMap<List<ChildTrackInfo>> resultMap =new ResultMap<List<ChildTrackInfo>>("",list,0,list.size());
        return resultMap;
    }


    /**
     * 修改日志
     * @param waybillNumber
     * @return
     */
    @RequestMapping("/SelectUpdateLogInfoByWaybillNumber")
    public Object SelectUpdateLogInfoByWaybillNumber(String waybillNumber){
        List<UpdateLogInfo> list = updateLogInfoService.getData(new UpdateLogInfo().setWaybillNumber(waybillNumber));

        Collections.sort(list, new Comparator<UpdateLogInfo>(){
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            public int compare(UpdateLogInfo o1, UpdateLogInfo o2) {
                return (o2.getOperationTime().toString()).compareTo(o1.getOperationTime().toString());
            }
        });
        for (int i=1;i<=list.size();i++){
            list.get(i-1).setId(i);
        }

        ResultMap<List<UpdateLogInfo>> resultMap =new ResultMap<List<UpdateLogInfo>>("",list,0,list.size());
        return resultMap;
    }

    /**
     * 子单信息
     * @param waybillNumber
     * @return
     */
    @RequestMapping("/SelectChildOrdersInfoByWaybillNumber")
    public Object SelectChildOrdersInfoByWaybillNumber(String waybillNumber){
        List<ChildOrdersInfo> list = childOrdersInfoService.getData(new ChildOrdersInfo().setWaybillNumber(waybillNumber));
        ResultMap<List<ChildOrdersInfo>> resultMap =new ResultMap<List<ChildOrdersInfo>>("",list,0,list.size());
        return resultMap;
    }

    /**
     * 运单文件
     * @param waybillNumber
     * @return
     */
    @RequestMapping("/SelectWaybillDocumentInfoByWaybillNumber")
    public Object SelectWaybillDocumentInfoByWaybillNumber(String waybillNumber){
        List<WaybillDocumentInfo> list = waybillDocumentInfoService.getData(new WaybillDocumentInfo().setWaybillNumber(waybillNumber));

        Collections.sort(list, new Comparator<WaybillDocumentInfo>(){
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            public int compare(WaybillDocumentInfo o1, WaybillDocumentInfo o2) {
                return (o2.getCreateTime().toString()).compareTo(o1.getCreateTime().toString());
            }
        });
        for (int i=1;i<=list.size();i++){
            list.get(i-1).setId(i);
        }

        ResultMap<List<WaybillDocumentInfo>> resultMap =new ResultMap<List<WaybillDocumentInfo>>("",list,0,list.size());
        return resultMap;
    }

}
