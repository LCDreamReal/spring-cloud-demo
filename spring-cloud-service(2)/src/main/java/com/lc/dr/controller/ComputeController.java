package com.lc.dr.controller;

import org.apache.log4j.Logger;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Desc:     计算服务
 * Author:   licheng
 * Datetime: 2016-09-21 11:45
 */
@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private DiscoveryClient disClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b){

        ServiceInstance instance = disClient.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:"+instance.getHost()+", serviceId:"+instance.getServiceId()+", result r:"+r);
        return r;
    }
}
