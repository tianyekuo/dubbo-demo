package com.knight.demo.provider;

import com.knight.demo.CalService;
import org.springframework.stereotype.Service;


@Service
public class CalServiceImpl  implements CalService{
    @Override
    public int add(int i1, int i2) {
        System.out.println("test");
        return i1+i2;
    }
}
