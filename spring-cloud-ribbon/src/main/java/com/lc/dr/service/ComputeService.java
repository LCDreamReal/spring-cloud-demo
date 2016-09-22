package com.lc.dr.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Desc:
 * Author:   licheng
 * Datetime: 2016-09-22 11:31
 */
@Service
public class ComputeService {

    @Resource
    RestTemplate restTemplate;

    /**
     * @HystrixCommand注解来指定回调方法
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String compute(){

        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }

    /**
     * 回调函数
     * @return
     */
    public String fallbackMethod(){

        return "hystrix success";
    }
}
