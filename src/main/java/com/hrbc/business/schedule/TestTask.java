package com.hrbc.business.schedule;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {
    @Scheduled(cron = "0/10 * * * * ?")
    public void test() {
        //System.out.println(1111111);
    }
}
