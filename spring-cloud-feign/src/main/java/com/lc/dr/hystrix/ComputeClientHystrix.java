package com.lc.dr.hystrix;

import com.lc.dr.intf.ComputeClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Desc:
 * Author:   licheng
 * Datetime: 2016-09-22 13:59
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -200;
    }
}
