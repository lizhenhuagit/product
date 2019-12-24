package com.green.product.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.green.product.mapper.UserMapper;
import com.green.product.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
@Api(value = "产品接口")
@Slf4j
public class ProductController {

    @Autowired
    UserMapper userMapper;

    @ApiOperation(value="保存", notes="")
    @PostMapping("save")
    public String saveUser(){
    return "success";
    }

    @ApiOperation(value="查询", notes="")
    @GetMapping("select")
    public User selectUser(){
        /*QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("id",1);
        User user = userMapper.selectOne(queryWrapper);*/
        User user =new User();
        user.setId(1);
        user.setName("jack");
        return user;
    }
}
