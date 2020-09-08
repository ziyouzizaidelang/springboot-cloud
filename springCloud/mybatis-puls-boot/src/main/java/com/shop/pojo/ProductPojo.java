package com.shop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductPojo {
    @TableId(type = IdType.AUTO)
    private Integer id;
    //商品名
    private String productName;
    //商品价格
    private Double productPrice;
    //商品数量
    private Integer productSize;
    //商品简介
    private String productIntroduce;

}
