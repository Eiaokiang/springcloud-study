package com.eiaokiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 11:02 2021/4/12
 */


@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8001.class,args);
    }


}
