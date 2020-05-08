package com.os.contorller;


import com.os.entity.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author R
 * @date 2020/5/7 - 17:13
 */
@Controller
public class UserinfoController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "loginUser")
    public String login(Userinfo userinfo, HttpServletRequest request, HttpServletResponse response) throws Exception{
        userinfo= restTemplate.postForObject("http://order-provider/login",userinfo, Userinfo.class);
        System.out.println(userinfo);
        //request.getRequestDispatcher("login.html").forward(request,response);
        return "login";
    };
}
