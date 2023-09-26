package com.cabb.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cabb.model.po.User;
import org.springframework.stereotype.Repository;

/**
 * @InterFaceName SSMTestDao
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/9/19 15:05
 **/
@Repository
public interface SSMTestDao extends BaseMapper<User> {

    /**
     *
     * @return
     */
    String testDemo();
}
