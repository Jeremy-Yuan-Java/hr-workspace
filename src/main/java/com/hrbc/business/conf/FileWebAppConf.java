package com.hrbc.business.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author huangyongchao
 */
public class FileWebAppConf implements WebMvcConfigurer {
    @Autowired
    private PathConf pathConf;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(PathConf.ACCESS_PATH).addResourceLocations(pathConf.getFilerootpath());
    }
}
