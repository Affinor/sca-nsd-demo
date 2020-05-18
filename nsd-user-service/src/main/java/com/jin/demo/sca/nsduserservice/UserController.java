package com.jin.demo.sca.nsduserservice;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.jin.demo.sca.nsddubboapi.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /*@Reference
    UserService userService;*/

   /* @SentinelResource(value = "user-login",
            blockHandlerClass = ServiceHandler.class, blockHandler = "blockHandler",
            fallbackClass = ServiceHandler.class, fallback = "fallback")
    @GetMapping("/user/login")
    public String login(String email, String password){
        //return userService.login(email,password);
        return "test";
    }

    @GetMapping("/user/register")
    public String register(String email, String password,String username,Integer age){
        //return userService.register(email,password,username,age);
        return "test";
    }*/
}
