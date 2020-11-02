package com.hao.devicecenter.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.hao.commonmodel.user.Customer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

/**
 * @author Muggle Lee
 * @Date: 2019/9/15 22:33
 */
public interface CustomerMapper extends BaseMapper<Customer> {

    @Select("select * from customer")
    Set<Customer> getAll(@Param(Constants.WRAPPER) Wrapper wrapper);

}
