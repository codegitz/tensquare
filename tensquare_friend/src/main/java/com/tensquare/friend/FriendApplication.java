package com.tensquare.friend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import util.IdWorker;
import util.JwtUtil;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-19 00:16
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class FriendApplication {
    public static void main(String[] args) {
        SpringApplication.run(FriendApplication.class);
    }
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }

    @Bean
    public JwtUtil jwtUtil(){
        return new util.JwtUtil();
    }
}

