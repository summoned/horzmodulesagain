package com.hm.support.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by summoned on 2018/3/23.
 */

@FeignClient(url = "http://127.0.0.1:8080/")
public interface MainServiceClient {
    @RequestMapping(value ="/testMain", method = RequestMethod.GET)
    public String testMain();
}
