package com.lc.dr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Desc:     ribbon消费Controller
 * Author:   licheng
 * Datetime: 2016-09-21 15:46
 */
@RestController
public class ConsumerController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping(value = "/compute", method = RequestMethod.GET)
    public String compute(){

        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }
}
