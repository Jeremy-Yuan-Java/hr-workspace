package com.hrbc.business.schedule;


import com.hrbc.business.service.CandidatesResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TestTask {

    @Autowired
    private CandidatesResumeService resumeService;

    @Scheduled(cron = "0 30 23 * * ?")
    public void test() {
        // 1.将通过简历解析获取的数据 重新解析一遍，信息保存在 resumedetail 字段中
        // 注意此操作不需要 插入新的候选人信息
         // 2.将手动录入的信息重新 同步到简历详情相关表结构中
        //System.out.println("开始同步数据");
       // long start = new Date().getTime();
        resumeService.updateSynchronizationCandidatesInfo();
       // long end = new Date().getTime();
       // System.out.println("同步结束:" + (end - start));
    }
}
