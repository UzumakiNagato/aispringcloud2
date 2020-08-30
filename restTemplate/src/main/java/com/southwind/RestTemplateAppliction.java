package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateAppliction {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateAppliction.class,args);
    }

    //将RestTemplate注入到ioc容器
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
