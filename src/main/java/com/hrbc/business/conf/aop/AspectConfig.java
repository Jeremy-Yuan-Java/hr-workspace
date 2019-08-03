package com.hrbc.business.conf.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author huangyongchao
 * AOP自动装配的conf
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AspectConfig {

    @Bean
    public AuthAspect authenticationAop() {
        return new AuthAspect();
    }

    @Bean
    public ProcessLogAspect logAop() {
        return new ProcessLogAspect();
    }
}