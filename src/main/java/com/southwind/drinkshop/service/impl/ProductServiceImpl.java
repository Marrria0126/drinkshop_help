package com.southwind.drinkshop.service.impl;

import com.southwind.drinkshop.entity.Product;
import com.southwind.drinkshop.mapper.ProductMapper;
import com.southwind.drinkshop.service.ProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
