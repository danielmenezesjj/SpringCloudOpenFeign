package com.SpringCloudOpenFeign.SpringCloudOpenFeign.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudOpenFeignCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOpenFeignCepApplication.class, args);
	}

}
