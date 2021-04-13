package com.eiaokiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:48 2021/4/12
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Provider8004 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8004.class,args);
    }
}
