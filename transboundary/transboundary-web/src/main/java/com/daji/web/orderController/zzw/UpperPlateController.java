package com.daji.web.orderController.zzw;

import com.daji.pojo.UpdatePlate;
import com.daji.service.UpdatePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("upperplate")
public class UpperPlateController {
    @Autowired
    private UpdatePlateService updatePlateService;

    @RequestMapping("findUpPlate")
    public List<UpdatePlate> findUpPlate(){
        return updatePlateService.getAll();
    }
    @RequestMapping("findUpPlateOne")
    public UpdatePlate findUpPlateOne(UpdatePlate updatePlate){
        return updatePlateService.getOne(updatePlate);
    }
}
