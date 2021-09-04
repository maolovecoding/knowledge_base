package com.mao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: CorsConfig
 * @Description: 解决跨域问题配置类
 * @Author 毛毛
 * @CreateDate 2021/09/04/周六 13:21
 * @Version: v1.0
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 针对所有接口都配置跨域
        registry.addMapping("/**")
                // 允许来源为所以
                .allowedOriginPatterns("*")
                // 请求头
                .allowedHeaders(CorsConfiguration.ALL)
                // 请求方式
                .allowedMethods(CorsConfiguration.ALL)
                // 允许请求带着凭证 比如cookie jwt token
                .allowCredentials(true)
                // 一个小时内不需要再预检
                // 一般post请求都会进行一个预请求，发（options请求），用来检测接口是否正常
                .maxAge(3600);
    }
}
