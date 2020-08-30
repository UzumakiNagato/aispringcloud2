package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //包含了@EnableZuuleServer，设置该类是网关启动类
@EnableAutoConfiguration //可以帮助Spring boot应用将所有符合条件的@Configuration配置加载到当前spring boot创建并使用的ioc容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
