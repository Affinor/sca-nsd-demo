package com.jin.demo.sca.nsdemailservice;

public class EmailServiceHandler {

    public static String blockHandler(){
        return "不好意思，被限流了~~返回了个默认值:哈哈！！";
    }

    public static String fallback(){
        return "发生了异常！！返回了个默认值:哦";
    }

}
