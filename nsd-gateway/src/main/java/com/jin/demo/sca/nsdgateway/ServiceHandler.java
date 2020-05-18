package com.jin.demo.sca.nsdgateway;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class ServiceHandler {

    public static String blockHandler(String email, String password, BlockException blockException){
        return "被限流了，等会儿再登录吧~~";
    }

    public static String blockHandlerRegister(String email, String password,String username,Integer age, BlockException blockException){
        return "被限流了，等会儿再注册吧！！\r\n email:"+email;
    }

    public static String fallback(String email, String password){
        return "服务器睡着了，稍后再试！！";
    }

}
