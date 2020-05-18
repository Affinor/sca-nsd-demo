package com.jin.demo.sca.nsdcodeservice;

public class CodeServiceHandler {

    public static String blockHandler(){
        return "不好意思，被限流了~~";
    }

    public static String fallback(){
        return "发生了异常！！返回了个默认值~~";
    }
}
