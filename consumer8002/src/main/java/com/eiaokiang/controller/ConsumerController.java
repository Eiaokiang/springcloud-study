package com.eiaokiang.controller;

import com.eiaokiang.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:09 2021/4/12
 */

@RequestMapping("consumer")
@RestController
public class ConsumerController {

    @Value("${hello}")
    String config;

    @Resource
    ProviderService providerService;

    @RequestMapping("get")
    public String get(){
        return providerService.get();
    }

    @RequestMapping("get/config")
    public String config(){
        return config;
    }
}
