package com.jin.demo.sca.nsdcodeservice;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.jin.demo.sca.nsddubboapi.api.CodeService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Service
@Component
public class CodeServiceImpl implements CodeService {

    @SentinelResource(value = "code-service",
            blockHandlerClass = CodeServiceHandler.class, blockHandler = "blockHandler",
            fallbackClass = CodeServiceHandler.class, fallback = "fallback")
    @Override
    public String createCode(String email) {
        return email+":"+UUID.randomUUID().toString();
    }
}
