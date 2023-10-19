package com.cabb.service;

import com.cabb.model.po.User;

/**
 * @InterFaceName UserService
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/9/20 11:36
 **/
public interface UserService {

    String addUser(User user);

    User findUserById(Integer userId);

    User findUserByName(String username);

}
