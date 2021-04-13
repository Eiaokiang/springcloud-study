package com.eiaokiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:24 2021/4/12
 */

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.eiaokiang.service")
@SpringBootApplication
public class Consumer8002 {



    public static void main(String[] args) {
        SpringApplication.run(Consumer8002.class,args);
    }
}
