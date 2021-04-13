package com.eiaokiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 16:03 2021/4/12
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServer9001 {


    public static void main(String[] args) {
        SpringApplication.run(ConfigServer9001.class,args);
    }
}
