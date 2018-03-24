package com.hm.support;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Created by summoned on 2018/3/23.
 */

@Configuration
@EnableAutoConfiguration
@EnableFeignClients
public class FeignContext {
}
