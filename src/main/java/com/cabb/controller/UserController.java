package com.cabb.controller;

import com.cabb.model.po.User;
import com.cabb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/9/20 11:36
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @PostMapping("/addUser")
    @ResponseBody
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping("/findUserById")
    @ResponseBody
    public User findUserById(@RequestParam Integer userId){
        return userService.findUserById(userId);
    }
}
