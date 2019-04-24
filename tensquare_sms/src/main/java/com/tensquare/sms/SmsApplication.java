package com.tensquare.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-14 16:04
 **/
@SpringBootApplication
@EnableEurekaClient
public class SmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class);
    }
}
