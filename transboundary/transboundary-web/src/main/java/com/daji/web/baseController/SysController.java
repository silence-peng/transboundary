package com.daji.web.baseController;

import com.daji.pojo.User;
import com.daji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/transboundaryV5")
public class SysController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    public Object login(User user,HttpSession session){
        User user1=userService.getOne(user);
        if (user1!=null){
            session.setAttribute("user", user1);
            return true;
        }
        return false;
    }
    @RequestMapping("loginOut")
    public void loginOut(HttpSession session){
        session.removeAttribute("user");
    }
    @RequestMapping("getUserInfo")
    public Object getUserInfo(HttpSession session){
        return session.getAttribute("user");
    }
}
