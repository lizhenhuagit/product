package com.green.product.mapper;

import com.green.product.ProductApplication;
import com.green.product.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProductApplication.class )
public class userMapperTest {
    @Autowired
    UserMapper userMapper;
    @Test
    public void mapperTest(){
        User u=new User();
        u.setId(2);
        userMapper.insert(u);
    }
}