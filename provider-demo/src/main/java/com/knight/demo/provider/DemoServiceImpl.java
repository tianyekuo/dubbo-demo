package com.knight.demo.provider;
import com.knight.demo.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by ZhangTao on 2017/6/27.
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String name) {

//        return "Hello " + name + RpcContext.getContext().getLocalAddress();
        return "aaaaabbbbbcccccdddddeeeee";
    }
}
