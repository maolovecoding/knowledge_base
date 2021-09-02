package com.mao.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author 毛毛
 * @SpringBootApplication: springboot的启动类配置注解
 * @ComponentScan: 配置扫描的包
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.mao.controller", "com.mao.service"})
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
        LOG.info("地址： \t http://127.0.0.1:{}", env.getProperty("server.port"));
    }
}