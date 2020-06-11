package com.daji.web.baseController;

import com.daji.pojo.User;
import com.daji.service.UserService;

import com.daji.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;



@RestController
@RequestMapping("/transboundaryV5")
public class SysController {
    @Autowired
    private UserService userService;
    @Resource
    private RedisUtil redisUtil;
    @RequestMapping("login")
    public Object login(User user, HttpServletResponse response){

        User user1=userService.getOne(user);
        if (user1!=null){
            return  redisUtil.set("user",user1);
        }
        return false;
    }

    @RequestMapping("getUserInfo")
    public Object getUserInfo(){
        return redisUtil.get("user");
    }
}
