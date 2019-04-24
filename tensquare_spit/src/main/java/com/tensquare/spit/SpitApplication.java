package com.tensquare.spit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import util.IdWorker;
import util.JwtUtil;

/**
 * @author: Quan
 *
 * @program: tensquare_parent
 *
 * @description:
 *
 * @create: 2019-04-10 23:52
 **/
@SpringBootApplication
@EnableEurekaClient
public class SpitApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpitApplication.class);
    }
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }

    @Bean
    public JwtUtil jwtUtil(){
        return new JwtUtil();
    }
}
