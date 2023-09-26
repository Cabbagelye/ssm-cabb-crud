package com.cabb.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cabb.model.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @InterFaceName UserDao
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/9/20 11:37
 **/

public interface UserDao {

    void addUser(@Param("user") User user);

    User findUserById(@Param("userId") Integer userId);

}
