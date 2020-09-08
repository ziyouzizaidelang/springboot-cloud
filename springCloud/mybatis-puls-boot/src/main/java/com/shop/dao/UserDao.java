package com.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.pojo.UserPojo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseMapper<UserPojo> {


}
