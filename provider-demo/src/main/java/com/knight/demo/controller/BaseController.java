package com.knight.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Component
//@RequestMapping("/")
public class BaseController {

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "hello";
    }

}
