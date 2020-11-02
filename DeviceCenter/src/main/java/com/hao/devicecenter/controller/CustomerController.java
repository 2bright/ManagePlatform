package com.hao.devicecenter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class CustomerController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from devicecenter";
    }
}
