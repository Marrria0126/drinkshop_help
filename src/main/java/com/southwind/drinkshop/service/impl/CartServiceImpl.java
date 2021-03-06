package com.southwind.drinkshop.service.impl;

import com.southwind.drinkshop.entity.Cart;
import com.southwind.drinkshop.mapper.CartMapper;
import com.southwind.drinkshop.service.CartService;
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
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {

}
