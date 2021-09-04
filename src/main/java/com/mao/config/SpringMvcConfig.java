package com.mao.config;

import com.mao.interceptor.LogInterceptor;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: SpringMvcConfig
 * @Description: mvc的配置类，注入拦截器 （不再使用）
 * @Author 毛毛
 * @CreateDate 2021/09/04/周六 17:18
 * @Version: v1.0
 */
// @Configuration
public class SpringMvcConfig implements WebMvcConfigurer {
    /**
     * 注入拦截器
     */
    // @Autowired
    private LogInterceptor logInterceptor;

    /**
     * 注册拦截器
     *
     * @param registry
     */
    // @Override
    // public void addInterceptors(InterceptorRegistry registry) {
    //     registry.addInterceptor(logInterceptor)
    //             // 拦截器对所有的请求都生效
    //             .addPathPatterns("/**")
    //             // 排除某个请求，不对其进行拦截
    //             .excludePathPatterns("/login");
    // }
}
