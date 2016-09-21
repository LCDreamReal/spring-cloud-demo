package com.lc.dr.controller;

import com.lc.dr.intf.ComputeClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Desc:     feign消费Controller
 * Author:   licheng
 * Datetime: 2016-09-21 15:46
 */
@RestController
public class ConsumerController {

    @Resource
    ComputeClient computeClient;

    @RequestMapping(value = "/compute", method = RequestMethod.GET)
    public String compute(){

        return computeClient.compute(10,20);
    }
}
