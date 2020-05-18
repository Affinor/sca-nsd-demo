package com.jin.demo.sca.nsduserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.alibaba.nacos")
@EntityScan("com.jin.demo.sca.nsduserservice")
@EnableDiscoveryClient
public class NsdUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NsdUserServiceApplication.class, args);
    }

}
