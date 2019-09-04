package com.green.product.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
@Api(value = "产品接口")
@Slf4j
public class ProductController {
    @ApiOperation(value="保存", notes="")
    @PostMapping("save")
    public String saveUser(){
    return "success";
    }
}
