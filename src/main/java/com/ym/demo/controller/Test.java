package com.ym.demo.controller;

import com.ym.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("demo")
public class Test {

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        userService.findUserByUsername("brucelee");
        return "test";
    }
}
