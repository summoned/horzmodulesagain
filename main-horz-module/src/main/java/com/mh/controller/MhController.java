package com.mh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by summoned on 2018/3/23.
 */

@RestController
public class MhController {
    @RequestMapping(value = "/testMain")
    public String testMain(){
        return "hello main";
    }
}
