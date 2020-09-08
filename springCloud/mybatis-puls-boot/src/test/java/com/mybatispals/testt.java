package com.mybatispals;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shop.mapper.UserMapper;
import com.shop.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testt {

    @Resource
    private UserMapper userMapper;

    @Test
    public void addUser(){
        User user = new User();
        user.setName("f");
        user.setAge(0);
        user.setEmail("f");
        userMapper.insert(user);
    }
    @Test
    public void selectUserById(){
        System.out.println("userMapper = " + userMapper.selectById(1));
    }

    @Test
    public void selectForListt(){
        User user = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getId, 1L));
        System.out.println(user);
        List<User> list = userMapper.selectList(new QueryWrapper<User>().select());
        list.forEach(x-> {
                    System.out.println(userMapper.selectById(x.getId()));
                    System.out.println("--------------------");
                    System.out.println(x.getId());

        }
        );
    }



}
