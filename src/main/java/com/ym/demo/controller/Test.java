package com.ym.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("demo")
public class Test {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "test";
    }
}
