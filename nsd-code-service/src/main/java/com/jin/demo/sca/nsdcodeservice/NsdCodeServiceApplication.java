package com.jin.demo.sca.nsdcodeservice;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NsdCodeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NsdCodeServiceApplication.class, args);
    }

}
