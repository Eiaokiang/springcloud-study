package com.eiaokiang.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Eiaokiang
 * @Description:
 * @Date: Created in 14:01 2021/4/12
 */

@FeignClient(value = "PROVIDER")
public interface ProviderService {

    @RequestMapping("provider/get")
    public String get();

}
