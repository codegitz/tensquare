package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * @author: Quan
 *
 * @program: tensquare_parent
 *
 * @description:
 *
 * @create: 2019-04-03 22:53
 **/

@SpringBootApplication
@EnableEurekaClient
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1,1);
    }
}
