package com.hm.controller;

import com.hm.support.service.MainServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by summoned on 2018/3/23.
 */

@RestController
public class EhController {
    @Autowired
    private MainServiceClient mainServiceClient;

    @RequestMapping(value = "/testExtra")
    public String testExtra(){
        return "hello extra";
    }

    @RequestMapping(value = "/callMain")
    public String callMain(){
        String msg = mainServiceClient.testMain();
        return msg;
    }
}
