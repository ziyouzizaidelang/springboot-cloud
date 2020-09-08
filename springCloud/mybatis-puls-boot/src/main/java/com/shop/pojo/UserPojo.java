package com.shop.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserPojo {

    @TableId(type = IdType.AUTO)
    private Integer id;
    //用户名
    private String userName;
    //加密密码
    private String passWord;
    //明文密码
    private String pwd;
    //地址
    private String addres;
    //邮箱
    private String email;
    //电话
    private String phone;
    //年龄
    private Integer age;
    //性别
    private String sex;





}
