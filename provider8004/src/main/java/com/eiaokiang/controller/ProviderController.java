package com.eiaokiang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 13:59 2021/4/12
 */

@RestController
@RequestMapping("provider")
public class ProviderController {

    @RequestMapping("get")
    public String get(){
        return "hello feign - 8004";
    }

}
