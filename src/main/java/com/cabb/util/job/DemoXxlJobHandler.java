package com.cabb.util.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoXXLJobHandler
 * @Description TODO
 * @Author Cabbagelye
 * @Date 2023/10/7 10:17
 **/
@Component
public class DemoXxlJobHandler{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @XxlJob("demoXxlJobHandler")
    public ReturnT<String> demoXxlJobHandler(String param) throws Exception {

        logger.info(">>>>>>>>>>>>>this is a xxl-job-handler<<<<<<<<<<<<<<<<<<<<<");
        return ReturnT.SUCCESS;
    }
}
