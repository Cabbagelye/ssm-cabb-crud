package com.cabb.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import groovy.lang.GrabConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName XxlJobConfig
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/10/7 10:20
 **/

@Configuration
public class XxlJobConfig {


    @Value("${xx.job.admin.addresses}")
    private String adminAddresses;
    @Value("${xx.job.executor.appName}")
    private String appName;
    @Value("${xx.job.executor.ip}")
    private String ip;
    @Value("${xx.job.executor.port}")
    private Integer port;
    @Value("${xx.job.accessToken}")
    private String accessToken;
    @Value("${xx.job.executor.logPath}")
    private String logPath;
    @Value("${xx.job.executor.logRetentionDays}")
    private Integer logRetentionDays;

    @Bean
    public XxlJobSpringExecutor xxlJobSpringExecutor(){

        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(adminAddresses);
        xxlJobSpringExecutor.setAppname(appName);
        xxlJobSpringExecutor.setIp(ip);
        xxlJobSpringExecutor.setPort(port);
        xxlJobSpringExecutor.setAccessToken(accessToken);
        xxlJobSpringExecutor.setLogPath(logPath);
        xxlJobSpringExecutor.setLogRetentionDays(logRetentionDays);

        return xxlJobSpringExecutor;
    }


}
