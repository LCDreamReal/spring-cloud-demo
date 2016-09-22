package com.lc.dr;

import com.lc.dr.filter.AuthenticationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Desc:
 * Author:   licheng
 * Datetime: 2016-09-22 16:24
 */
@EnableZuulProxy
@SpringCloudApplication
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }

    @Bean
    public AuthenticationFilter authenticationFilter(){
        return new AuthenticationFilter();
    }
}
