package com.hrbc.business;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author huangyongchao
 */
@SpringBootApplication
@EnableScheduling
@MapperScan({"com.hrbc.business.mapper"})
public class BusinessApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }

}
