package com.q;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.q")
public class SpringBootNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNewApplication.class, args);
	}
	
}
