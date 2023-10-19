package com.cabb.util.shiro;

import com.cabb.model.po.User;
import com.cabb.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * @ClassName MyRealm
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/10/18 11:10
 **/
public class MyRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;


    /**
     * 认证方式一
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证方式二
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //通过token获取用户名
        String  username = (String) authenticationToken.getPrincipal();
        //校验用户名是否存在
        User user = userService.findUserByName(username);
        if (null != user){
            return new SimpleAuthenticationInfo(user,"123456",this.getName());
        }
        return null;
    }
}
