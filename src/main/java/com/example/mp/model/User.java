package com.example.mp.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: guoyuting
 * @Date: Created at 2019/3/27 4:17 PM
 */
@Data
@TableName(value = "USER")
public class User {
    @TableId
    @TableField(value = "ID")
    private Long id;

    @TableField(value = "NAME")
    private String name;

    @TableField(value = "AGE")
    private Integer age;
}
