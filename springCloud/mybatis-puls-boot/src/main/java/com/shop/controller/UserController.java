package com.shop.controller;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shop.pojo.UserPojo;
import com.shop.service.UserService;
import com.shop.utils.ResponseCommonPojo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


import static com.shop.utils.ExceptionEnum.ERROR;
import static com.shop.utils.ExceptionEnum.SUCCESS;

@RestController
@RequestMapping(value = "/user", produces = "application/json; charset=utf-8")
public class UserController {

    @Resource
    UserService userService;

    /**
     * 添加
     * @param userPojo
     * @return
     */
    @PostMapping("/addUser")
    public ResponseCommonPojo addUser(UserPojo userPojo){
        try{
            boolean info = userService.save(userPojo);
            if (info){
                return ResponseCommonPojo.getInstance(SUCCESS);
            }else {
                return ResponseCommonPojo.getInstance(ERROR);
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResponseCommonPojo.getInstance(ERROR);
        }
    }

    /**
     * 查询单个
     * @param id
     * @return
     */
    @GetMapping("/queryUserById")
    public ResponseCommonPojo queryUserById(Long id){
        try{
            UserPojo userPojo = userService.getById(id);
            return ResponseCommonPojo.getInstance(SUCCESS,userPojo);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseCommonPojo.getInstance(ERROR);
        }
    }

    /**
     * 查询集合分页
     * @return
     */
    @GetMapping("/queryUserList")
    public ResponseCommonPojo queryUserList(Long current,Long size){
        try{
            Page<UserPojo> page = new Page<UserPojo>(current,size);
            //排序
            page.addOrder(OrderItem.desc("age"));
            //无条件分页
            Page<UserPojo> list1 = userService.page(page);
            //有条件分页
            Page list2 = userService.lambdaQuery().like(UserPojo::getUserName, "a").page(page);

            return ResponseCommonPojo.getInstance(SUCCESS,list2);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseCommonPojo.getInstance(ERROR);
        }
    }

    /**
     * 更新用户数据
     * @return
     */
    @PutMapping("/updateUser")
    public ResponseCommonPojo updateUser(UserPojo userPojo){
        try{
            boolean info = userService.update(userPojo,Wrappers.<UserPojo>lambdaUpdate()
                    .eq(UserPojo::getId, userPojo.getId()));
            if (info){
                return ResponseCommonPojo.getInstance(SUCCESS);
            }else {
                return ResponseCommonPojo.getInstance(ERROR);
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResponseCommonPojo.getInstance(ERROR);
        }
    }

    /**
     * 删除用户
     * @return
     */
    @DeleteMapping("/delUser")
    public ResponseCommonPojo delUser(long id){
        try{
            boolean info = userService.removeById(id);
            if (info){
                return ResponseCommonPojo.getInstance(SUCCESS);
            }else {
                return ResponseCommonPojo.getInstance(ERROR);
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResponseCommonPojo.getInstance(ERROR);
        }
    }
}
