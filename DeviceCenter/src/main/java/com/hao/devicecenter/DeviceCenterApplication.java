package com.hao.devicecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DeviceCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeviceCenterApplication.class, args);
    }
}
