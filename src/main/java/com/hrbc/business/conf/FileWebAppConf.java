package com.hrbc.business.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author huangyongchao
 */
@Configuration
public class FileWebAppConf implements WebMvcConfigurer {
    @Autowired
    private PathConf pathConf;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(PathConf.ACCESS_PATH.concat("**")).addResourceLocations("file:"+pathConf.getFilerootpath());
    }
}
