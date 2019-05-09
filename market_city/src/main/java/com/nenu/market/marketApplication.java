package com.nenu.market;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.nenu.market.mapper")
@SpringBootApplication
public class marketApplication {

	public static void main(String[] args) {

		SpringApplication.run(marketApplication.class, args);
	}

}
