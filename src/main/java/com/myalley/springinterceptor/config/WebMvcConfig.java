package com.myalley.springinterceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    @Qualifier(value = "httpInterceptor")
    private HandlerInterceptor httpInterceptor;

    @Autowired
    @Qualifier(value = "httpInterceptor2")
    private HandlerInterceptor httpInterceptor2;

    @Autowired
    @Qualifier(value = "httpInterceptor3")
    private HandlerInterceptor httpInterceptor3;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(httpInterceptor)
                .addPathPatterns("/**")             //전체 포함
                .excludePathPatterns("/user/**");   //user 하위는 제외
        registry.addInterceptor(httpInterceptor2)
                .addPathPatterns("/**")             //전체 포함
                .excludePathPatterns("/user/**");   //user 하위는 제외
        registry.addInterceptor(httpInterceptor3)
                .addPathPatterns("/**")             //전체 포함
                .excludePathPatterns("/user/**");   //user 하위는 제외
    }

}
