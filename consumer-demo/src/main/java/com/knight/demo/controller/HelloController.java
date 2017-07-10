package com.knight.demo.controller;

import com.knight.demo.consumer.CalAction;
import com.knight.demo.consumer.DemoAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//    @Autowired
//    private DemoService demoService;
//
//    public void setDemoService(DemoService demoService) {
//        this.demoService = demoService;
//    }

    @Autowired
    private CalAction calAction;

    @Autowired
    private DemoAction demoAction;

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
//        return demoService.sayHello("world");
        return "From consumer";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String HelloFromDubbo(){
//        return "From consumer dubbo";
        String result = demoAction.sayHello();
        return result;
    }

    @RequestMapping("/cal")
    @ResponseBody
    public String CalFromDubbo(){
//        return "From consumer dubbo";
        int result = calAction.calc();
        return String.valueOf(result);
    }

}
