package com.cabb.service.impl;

import com.cabb.dao.UserDao;
import com.cabb.model.po.User;
import com.cabb.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/9/20 11:36
 **/

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    /**
     *
     * @param user
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public String addUser(User user) {
        userDao.addUser(user);
        return "添加成功";
    }

    /**
     *
     * @param userId
     * @return
     */
    @Override
    public User findUserById(Integer userId) {
        return userDao.findUserById(userId);
    }
}
