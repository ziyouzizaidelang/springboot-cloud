package com.shop.service.impl;

import com.shop.dao.ProductMapper;
import com.shop.pojo.ProductPojo;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhanglele
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean addProduct(ProductPojo productPojo) {
        int info = productMapper.insert(productPojo);
        if (info != 0){
            return true;
        }else {
            return false;
        }
    }
}
