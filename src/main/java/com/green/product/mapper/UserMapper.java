package com.green.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.green.product.pojo.User;

public interface UserMapper extends BaseMapper<User> {
    int insertu(User user);
}
