package com.jin.demo.sca.nsduserservice;

import com.jin.demo.sca.nsddubboapi.api.CodeService;
import com.jin.demo.sca.nsddubboapi.api.EmailService;
import com.jin.demo.sca.nsddubboapi.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Reference
    CodeService codeService;

    @Reference
    EmailService emailService;

    @Override
    public String login(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        int size = userDao.findAll(Example.of(user)).size();
        return "login success:"+(size>0);
    }

    @Override
    public String register(String email, String password, String username, Integer age) {
        boolean checkRegister = checkRegister(email);
        if (checkRegister){
            return "用户:"+email+"已经注册过了~~";
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setAge(age);
        User save = userDao.save(user);
        String code = codeService.createCode(email);
        System.out.println("生成验证码:"+code);
        String em = emailService.sendEmail(email, code);
        System.out.println("发送邮件:"+em);
        return "register success:"+save+"\r\n生成验证码:"+code+"\r\n发送邮件:"+em;
    }

    @Override
    public String checkLogin(String token) {
        return "checkLogin success";
    }

    @Override
    public Boolean checkRegister(String email) {
        User user = new User();
        user.setEmail(email);
        return userDao.exists(Example.of(user));
    }
}
