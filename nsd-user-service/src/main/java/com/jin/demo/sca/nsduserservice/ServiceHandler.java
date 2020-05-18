package com.jin.demo.sca.nsduserservice;

public class ServiceHandler {

    public static String blockHandler(){
        return "被限流了，等会儿再登录吧~~";
    }

    public static String fallback(){
        return "服务器睡着了，稍后再试！！";
    }

}
