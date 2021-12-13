package com.jsf.test.springdemo;

import com.jsf.test.springdemo.interceptor.GetTestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author SifanJia <jiasifan03@kuaishou.com>
 * Created on ${2021}-${12}-${1}
 */
@Configuration
public class DemoWebConfig implements WebMvcConfigurer {

    @Bean
    GetTestInterceptor getTestInterceptor() {
        return new GetTestInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getTestInterceptor())
                .addPathPatterns("/**");
    }
}
