package com.lc.dr.intf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Desc:
 * Author:   licheng
 * Datetime: 2016-09-21 17:57
 */
@FeignClient(value = "compute-service")
public interface ComputeClient {

    /**
     * 和服务端RequestMapping和method保持一致
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
