package com.lc.dr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceApplication.class, args);
	}
}
