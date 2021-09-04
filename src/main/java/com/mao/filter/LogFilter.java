package com.mao.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClassName: LogFilter
 * @Description: 登录检查的过滤器 （本项目也不再使用）
 * @Author 毛毛
 * @CreateDate 2021/09/04/周六 17:01
 * @Version: v1.0
 */
// @Component
public class LogFilter implements Filter {
    public static final Logger LOG = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 打印日志信息
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        LOG.info("----------------LogFilter 开始 -----------------");
        LOG.info("请求地址：{} {}", request.getRequestURI().toString(), request.getMethod());
        LOG.info("远程地址：{}", request.getRemoteAddr());
        // 请求开始时间
        long startTime = System.currentTimeMillis();
        // 放行
        filterChain.doFilter(servletRequest, servletResponse);
        LOG.info("----------LogFilter 结束 耗时：{} ns -----------", System.currentTimeMillis() - startTime);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

}
