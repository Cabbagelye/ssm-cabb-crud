package com.cabb.util.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoXXLJobHandler
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/10/7 10:17
 **/
@Component
public class DemoXxlJobHandler{
    @XxlJob("demoXxlJobHandler")
    public ReturnT<String> demoXxlJobHandler(String param) throws Exception {

        System.out.println(">>>>>>>>>>>>>this is a xxl-job-handler<<<<<<<<<<<<<<<<<<<<<");
        int k = 0;
        double atan = 0;
        for (int i = 0; i < 5; i++) {
            k = i+k;
            atan = Math.atan(i);
        }
        System.out.println("输出结果为：k= " + k + ", atan = " + atan);
        return ReturnT.SUCCESS;
    }
}
