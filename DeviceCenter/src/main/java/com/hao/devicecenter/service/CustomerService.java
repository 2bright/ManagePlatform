package com.hao.devicecenter.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.hao.commonmodel.user.*;
import com.hao.devicecenter.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.util.Set;

@Slf4j
@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public Set<Customer> getAll() {
        return customerMapper.getAll(new QueryWrapper<Customer>());
    }
}
