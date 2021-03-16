package com.southwind.drinkshop.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.southwind.drinkshop.enums.GenderEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yihong
 * @since 2021-03-10
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class User1 implements Serializable {

    private static final long serialVersionUID = 1L;
  @TableId(type = IdType.AUTO)
    private Integer id;

    private String loginName;

    private String userName;

    private String password;

    private GenderEnum gender;

    private String identityCode;

    private String email;

    private String mobile;

    private String fileName;

      @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

      @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateTime;


}
