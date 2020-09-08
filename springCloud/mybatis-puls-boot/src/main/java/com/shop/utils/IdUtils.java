package com.shop.utils;

import java.util.UUID;

/**
 * @Auther: LELE
 * @Date: 2019/7/20 11:25
 * @Description:
 */
public class IdUtils {

	 public static String getId(){
         return UUID.randomUUID().toString().replace("-", "");
    }

}
