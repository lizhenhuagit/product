package com.green.product.mapper;

import com.green.product.ProductApplication;
import com.green.product.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
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
        u.setId(8);
        u.setName("marry");
        int insert = userMapper.insertu(u);
        System.out.println(insert);
    }
    @Test
    public void Test(){
        String s="abc";
        String s1 =new String("abc");
        System.out.println(StringUtils.equals(s,s1));

    }
}