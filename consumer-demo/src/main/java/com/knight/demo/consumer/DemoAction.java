package com.knight.demo.consumer;

import com.knight.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoAction {

    @Autowired
    private DemoService demoService;

//    public void setDemoService(DemoService demoService) {
//        this.demoService = demoService;
//    }

    public String sayHello()
    {
        return demoService.sayHello("world");
    }

}
