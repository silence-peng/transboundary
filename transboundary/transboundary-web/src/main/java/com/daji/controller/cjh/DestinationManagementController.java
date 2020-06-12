package com.daji.web.baseController.cjh;

import com.daji.pojo.DestinationManagement;
import com.daji.service.DestinationManagementService;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("DestinationManagement")
public class DestinationManagementController {
    @Autowired
    private DestinationManagementService destinationManagementService;


    @RequestMapping("finddestination")
    public ResultMap<List<DestinationManagement>> findestination(DestinationManagement destinationManagement){
        List<DestinationManagement> destinationManagements =destinationManagementService.getData(destinationManagement);
        return new ResultMap<List<DestinationManagement>>("",destinationManagements,0,destinationManagements.size());
    }

    @RequestMapping("getDestinationAll")
    public ResultMap<List<DestinationManagement>> getDestinationAll(DestinationManagement destinationManagement){
        List<DestinationManagement> destinationManagements =destinationManagementService.getAll();
        return new ResultMap<List<DestinationManagement>>("",destinationManagements,0,destinationManagements.size());
    }

    @RequestMapping("adddestination")
    public boolean add(DestinationManagement destinationManagement){
        int result=destinationManagementService.add(destinationManagement);
        if(result>0){
            return true;
        }
        return false;
    }

    @RequestMapping("deldestination")
    public boolean del(DestinationManagement destinationManagement){
        int result=destinationManagementService.del(destinationManagement);
        if(result>0){
            return true;
        }
        return false;
    }

    @RequestMapping("updatedestination")
    public boolean update(DestinationManagement destinationManagement){
        int result=destinationManagementService.upd(destinationManagement);
        if(result>0){
            return true;
        }
        return false;
    }
}
