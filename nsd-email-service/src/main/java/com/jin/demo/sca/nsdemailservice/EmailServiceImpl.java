package com.jin.demo.sca.nsdemailservice;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.jin.demo.sca.nsddubboapi.api.EmailService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class EmailServiceImpl implements EmailService {

    @SentinelResource(value = "email-service",
            blockHandlerClass = EmailServiceHandler.class, blockHandler = "blockHandler",
            fallbackClass = EmailServiceHandler.class, fallback = "fallback")
    @Override
    public String sendEmail(String email, String code) {
        return "向:"+email+"发送code:"+code+"成功！！";
    }
}
