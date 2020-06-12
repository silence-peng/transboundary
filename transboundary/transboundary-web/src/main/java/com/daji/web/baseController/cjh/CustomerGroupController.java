package com.daji.web.baseController.cjh;

import com.daji.pojo.CustomerGroup;
import com.daji.pojo.DestinationManagement;
import com.daji.service.CustomerGroupService;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("CustomerGroup")
public class CustomerGroupController {

    @Autowired
    private CustomerGroupService customerGroupService;

    @RequestMapping("finCustomer")
    public ResultMap<List<CustomerGroup>> fin(CustomerGroup customerGroup){
        List<CustomerGroup> customergroup=customerGroupService.getData(customerGroup);
        return new ResultMap<List<CustomerGroup>>("",customergroup,0,customergroup.size());
    }

    @RequestMapping("add")
    public boolean add(CustomerGroup customerGroup){
        customerGroup.setCreateDate(new Date());
        int result=customerGroupService.add(customerGroup);
        if(result>0){
            return true;
        }
        return false;
    }

    @RequestMapping("update")
    public boolean update(CustomerGroup customerGroup){

        int result=customerGroupService.upd(customerGroup);
        if(result>0){
            return true;
        }
        return false;
    }

    @RequestMapping("del")
    public boolean del(CustomerGroup customerGroup){

        int result=customerGroupService.del(customerGroup);
        if(result>0){
            return true;
        }
        return false;
    }
    @RequestMapping("get")
    public CustomerGroup findstination(CustomerGroup customerGroup){

        CustomerGroup customerGroups = customerGroupService.getOne(customerGroup);
        return customerGroups;
    }
}
