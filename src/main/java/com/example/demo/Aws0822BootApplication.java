package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class}) // 시큐리티 자동기능은 제외시키겠다
public class Aws0822BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Aws0822BootApplication.class, args);
	}

}
