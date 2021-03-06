package com.southwind.drinkshop.service.impl;

import com.southwind.drinkshop.entity.User;
import com.southwind.drinkshop.mapper.UserMapper;
import com.southwind.drinkshop.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yihong
 * @since 2021-03-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
