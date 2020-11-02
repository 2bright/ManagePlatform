package com.hao.devicecenter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
// import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hao.commonmodel.user.Customer;
import com.hao.devicecenter.service.CustomerService;

import java.util.Set;
import java.util.HashSet;

@Slf4j
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/customers")
    public Set<Customer> getCustomers() {
        // Set<String> result = new HashSet<String>();
        // result.add("hello");
        // result.add("world");
        return customerService.getAll();
    }
}
