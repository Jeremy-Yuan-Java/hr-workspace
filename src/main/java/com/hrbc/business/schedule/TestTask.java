package com.hrbc.business.schedule;


import com.hrbc.business.service.CandidatesResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class TestTask {

    @Autowired
    private CandidatesResumeService resumeService;

    //@Scheduled(cron = "0 50 23 * * ?")
    //@PostConstruct
    public void test() {
        // 同步数据 根据现有的数据生成  CandidatesResume对象
        /*System.out.println("开始同步数据");
        long start = new Date().getTime();
        resumeService.updateCandidatesInfo();
        long end = new Date().getTime();
        System.out.println("同步结束:" + (end - start));*/
    }
}
