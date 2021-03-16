package com.southwind.drinkshop.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yihong
 * @since 2021-03-06
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
    public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1L;

   @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer parentId;

    private Integer type;


}
