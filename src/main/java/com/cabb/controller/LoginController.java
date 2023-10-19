package com.cabb.controller;

import com.cabb.model.po.User;
import com.cabb.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/10/18 14:59
 **/
@Controller
@RequestMapping("/login")
public class LoginController {


    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) throws Exception {
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            //校验用户密码
            SecurityUtils.getSubject().login(token);
            return "登录成功";
        }catch (UnknownAccountException e){
            throw new Exception("用户名错误!!!!!");
        }catch (IncorrectCredentialsException e){
            throw new Exception("密码错误!!!!!");
        }
    }
}
