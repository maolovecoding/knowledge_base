package com.mao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 毛毛
 * @SpringBootApplication: springboot的启动类配置注解
 * @ComponentScan: 配置扫描的包
 * @MapperScan: 扫描持久层接口
 */
@RestController
@SpringBootApplication
@ComponentScan(basePackages = {
        "com.mao.controller",
        "com.mao.service",
        "com.mao.mapper",
        "com.mao.filter",
        "com.mao.interceptor",
        "com.mao.aspect"})
@MapperScan(basePackages = {"com.mao.mapper"})
public class KnowledgeBaseApplication {
    /**
     * 日志对象
     */
    public static final Logger LOG = LoggerFactory.getLogger(KnowledgeBaseApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(KnowledgeBaseApplication.class);
        // 获取环境
        ConfigurableEnvironment env = app.run(args).getEnvironment();
        LOG.info("项目启动成功！");
        //地址 端口号 通过环境配置对象可以获取到端口号
        LOG.info("地址： \t http://localhost:{}/", env.getProperty("server.port"));
    }
}