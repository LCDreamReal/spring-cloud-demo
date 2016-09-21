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

    @RequestMapping(value = "/compute", method = RequestMethod.GET)
    String compute(@RequestParam Integer a, @RequestParam Integer b);
}
