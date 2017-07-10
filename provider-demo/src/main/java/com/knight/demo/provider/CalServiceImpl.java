package com.knight.demo.provider;

import com.knight.demo.CalService;
import org.springframework.stereotype.Service;

/**
 * Created by ZhangTao on 2017/7/3.
 */
@Service
public class CalServiceImpl  implements CalService{
    @Override
    public int add(int i1, int i2) {
        return i1+i2;
    }
}
