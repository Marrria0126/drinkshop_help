package com.southwind.drinkshop.service.impl;

import com.southwind.drinkshop.entity.Order;
import com.southwind.drinkshop.mapper.OrderMapper;
import com.southwind.drinkshop.service.OrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
