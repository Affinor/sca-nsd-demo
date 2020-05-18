package com.jin.demo.sca.nsddubboapi.api;

public interface UserService {

    String login(String email, String password);

    String register(String email, String password,String username,Integer age);

    String checkLogin(String token);

    Boolean checkRegister(String email);

}
