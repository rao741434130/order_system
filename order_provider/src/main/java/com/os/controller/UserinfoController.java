package com.os.controller;

import com.os.entity.Userinfo;
import com.os.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author R
 * @date 2020/5/7 - 21:11
 */
@Controller
public class UserinfoController {

    @Autowired
    private  UserinfoService userinfoService;


    @PostMapping("login")
    @ResponseBody
    public Userinfo login(@RequestBody Userinfo userinfo) {
        userinfo= userinfoService.loginUser(userinfo);
        System.out.println(userinfo);
        return userinfo;
    }
}
