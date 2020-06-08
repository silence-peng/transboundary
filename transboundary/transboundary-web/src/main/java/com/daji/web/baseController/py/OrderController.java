package com.daji.web.baseController.py;

import com.daji.pojo.AssignRoute;
import com.daji.service.AssignRouteService;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("transboundaryV5")
public class OrderController {
    @Autowired
    private AssignRouteService assignRouteService;
    @RequestMapping("/order/loadAssignRouteList")
    public ResultMap<List<AssignRoute>> loadAssignRouteList(){
        List<AssignRoute> list=assignRouteService.getAll();
        return new ResultMap<List<AssignRoute>>("",list,0,list.size());
    }
}
