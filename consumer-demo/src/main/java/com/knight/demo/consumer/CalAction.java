package com.knight.demo.consumer;

import com.knight.demo.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ZhangTao on 2017/7/4.
 */
@Service
public class CalAction {

    @Autowired
    private CalService calService;


    public int calc()
    {
        return calService.add(1,2);
    }
}
