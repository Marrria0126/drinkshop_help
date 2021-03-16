package com.southwind.drinkshop.service;

import com.southwind.drinkshop.entity.Cart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.drinkshop.vo.CartVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Yihong
 * @since 2021-03-06
 */
public interface CartService extends IService<Cart> {
    public List<CartVO> findAllCartVOByUserId(Integer id);

}
