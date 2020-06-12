package com.daji.web.baseController.py;

import com.daji.pojo.AssignRoute;
import com.daji.pojo.PortBeforeIssueInfo;
import com.daji.pojo.ProblemLoginInfo;
import com.daji.pojo.TwoSidesInfo;
import com.daji.service.PortBeforeIssueInfoService;
import com.daji.service.ProblemLoginInfoService;
import com.daji.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("transboundaryV5")
public class AbnormalController {
    @Autowired
    private PortBeforeIssueInfoService portBeforeIssueInfoService;
    @Autowired
    private ProblemLoginInfoService problemLoginInfoService;
    /**
     * 港前问题状态
     * @return
     */
    @RequestMapping("/abnormal/loadPortBeforeIssueInfo")
    public List<PortBeforeIssueInfo> loadPortBeforeIssueInf(){
        return portBeforeIssueInfoService.getAll();
    }
    @RequestMapping("/abnormal/loadAssignRouteList")
    public ResultMap<List<ProblemLoginInfo>> loadAssignRouteList(){
        List<ProblemLoginInfo> list=problemLoginInfoService.getAll();
        return new ResultMap<List<ProblemLoginInfo>>("",list,0,list.size());
    }


}
