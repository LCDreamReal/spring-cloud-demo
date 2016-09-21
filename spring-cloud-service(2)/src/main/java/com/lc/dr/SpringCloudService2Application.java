package com.lc.dr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudService2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudService2Application.class, args);
	}
}
