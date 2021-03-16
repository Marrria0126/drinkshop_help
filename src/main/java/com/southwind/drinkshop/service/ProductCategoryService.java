package com.southwind.drinkshop.service;

import com.southwind.drinkshop.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.drinkshop.vo.ProductCategoryVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Yihong
 * @since 2021-03-06
 */
public interface ProductCategoryService extends IService<ProductCategory> {
    public List<ProductCategoryVO> getAllProductCategoryVO();
}



