package com.southwind.drinkshop.service;

import com.southwind.drinkshop.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Yihong
 * @since 2021-03-06
 */
public interface ProductService extends IService<Product> {
    public List<Product> findByCategoryId(String type, Integer categoryId);

   // List<Product> findByCategoryId(String type, Integer categoryId);

    /**
     * 后台管理系统返回商品数据
     */
   // public TableDataVO<TableProductVO> findAllTableData(Integer page,Integer limit);


}
