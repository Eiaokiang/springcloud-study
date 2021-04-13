package com.eiaokiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 15:30 2021/4/12
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Gateway9527 {

    public static void main(String[] args) {
        SpringApplication.run(Gateway9527.class, args);
    }

}
