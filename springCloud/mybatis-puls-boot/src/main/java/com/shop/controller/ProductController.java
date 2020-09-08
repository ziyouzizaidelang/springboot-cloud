package com.shop.controller;

import com.shop.pojo.ProductPojo;
import com.shop.service.ProductService;
import com.shop.utils.ExceptionEnum;
import com.shop.utils.ResponseCommonPojo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhanglele
 */
@RestController
@RequestMapping(value = "/product", produces = "application/json; charset=utf-8")
public class ProductController {

    @Resource
    ProductService productService;

    /**
     * 添加
     * @return
     */
    @PostMapping("/addProduct")
    public ResponseCommonPojo addProduct(ProductPojo productPojo){
        try{
            boolean info = productService.addProduct(productPojo);
            if (info){
                return ResponseCommonPojo.getInstance(ExceptionEnum.SUCCESS);
            }else {
                return ResponseCommonPojo.getInstance(ExceptionEnum.ERROR);
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResponseCommonPojo.getInstance(ExceptionEnum.ERROR);
        }
    }



}
