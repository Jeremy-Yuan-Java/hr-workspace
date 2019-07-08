package com.hrbc.business.conf;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * @author huangyongchao
 */
@Configuration
public class TokenInterceptorConf implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/**").excludePathPatterns("/api/auth/login","/api/auth/logout");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}


