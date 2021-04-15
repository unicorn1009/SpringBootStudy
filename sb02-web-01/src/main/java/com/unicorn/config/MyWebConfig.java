package com.unicorn.config;

import com.unicorn.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>
 * </p>
 * Created on 2021/04/14 22:00
 *
 * @author Unicorn
 */
// 自定义springmvc功能的配置类都是实现WebMvcConfigurer接口
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")     // 指定哪些路径需要拦截
                .excludePathPatterns("/","/login","/index.html");    // 指定哪些路径不需要拦截
    }
}
