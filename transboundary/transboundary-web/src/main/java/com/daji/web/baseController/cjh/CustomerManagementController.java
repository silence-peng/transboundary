package com.daji.web.baseController.cjh;

import com.daji.pojo.CustomerManagement;
import com.daji.pojo.DestinationManagement;
import com.daji.service.CustomerManagementService;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Customermanagement")
public class CustomerManagementController {

    @Autowired
    private CustomerManagementService customerManagementService;

    @RequestMapping("getCusotmermanagement")
    public ResultMap<List<CustomerManagement>> getAll(){
        List<CustomerManagement> list=customerManagementService.getAll();
        return new ResultMap<List<CustomerManagement>>("",list,0,list.size());
    }
}
