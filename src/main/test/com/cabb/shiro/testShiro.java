package com.cabb.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * @ClassName testShiro
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/10/18 10:46
 **/
public class testShiro {

    @Test
    public void testShiroBase(){

        //创建shiro安全管理器（Shiro核心）
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        //加载ini文件，获取配置用户信息
        IniRealm iniRealm = new IniRealm("classpath:shiro/shiro-authc.ini");
        //将iniRealm对象注入到securityManager
        securityManager.setRealm(iniRealm);
        //将安全管理器注入到当前环境中
        SecurityUtils.setSecurityManager(securityManager);
        //获取subject主体对象
        Subject subject = SecurityUtils.getSubject();
        //打印认证状态
        System.out.println("初始认证状态：" + subject.isAuthenticated());
        //创建一个携带账号和密码的令牌
        UsernamePasswordToken token = new UsernamePasswordToken("cabb", "cabbaga");
        //调用subject传入令牌进行登录
        subject.login(token);
        System.out.println("最终认证状态：" + subject.isAuthenticated());
    }

    @Test
    public void testArrStr(){
        int[] arr = new int[]{1,2,3,4,5,6};
        String str = "123456";
        boolean equals = arr.equals(str);
        System.out.println(equals);
    }

}
